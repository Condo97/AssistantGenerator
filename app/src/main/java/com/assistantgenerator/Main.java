/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.assistantgenerator;

import com.assistantgenerator.airtable.UploadAssistantToAirtableRequest;
import com.assistantgenerator.airtable.AirtableAssistant;
import com.assistantgenerator.gpt_function_calls.GenerateAssistantWebpageFC;
import com.assistantgenerator.keys.Keys;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.io.Resources;
import com.oaigptconnector.Constants;
import com.oaigptconnector.model.*;
import com.oaigptconnector.model.exception.OpenAIGPTException;
import com.oaigptconnector.model.generation.OpenAIGPTModels;
import com.oaigptconnector.model.request.chat.completion.OAIChatCompletionRequest;
import com.oaigptconnector.model.request.chat.completion.OAIChatCompletionRequestFunctionCall;
import com.oaigptconnector.model.request.chat.completion.OAIChatCompletionRequestMessage;
import com.oaigptconnector.model.response.chat.completion.http.OAIGPTChatCompletionResponse;
import httpson.Httpson;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.function.Consumer;

public class Main {

//    private static final HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).connectTimeout(Duration.ofMinutes(5)).build();

    public static final String airtableBaseID = "appukE1AJQnZNDjIh";
    public static final String airtableTableID = "tblsBXFMHiKHL0VlT";
    private static final URI airtableURI;
    static {
        try {
            airtableURI = new URI("https://api.airtable.com/v0/" + airtableBaseID + "/" + airtableTableID);
        } catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }


    public static void main(String[] args) throws IOException, OAISerializerException, OpenAIGPTException, InterruptedException, OAIDeserializerException {
        // Get all the inputAssistantStrings from the inputAssistantsList
        URL inputAssistantsListURL = Resources.getResource("inputAssistantList.txt");
        String[] inputAssistantsList = Resources.toString(inputAssistantsListURL, StandardCharsets.UTF_8).split("\n");

        // Create completable future list
        List<CompletableFuture<Void>> responseFutures = new ArrayList<>();

        // Iterate through each inputAssistantString in inputAssistantsList
        for (String inputAssistantString: inputAssistantsList) {
            // Get the first part of the input from the inputHead file
            URL inputHeadURL = Resources.getResource("inputHead.txt");
            String inputHead = Resources.toString(inputHeadURL, StandardCharsets.UTF_8);

            CompletableFuture<Void> responseFuture = getGenerateAssistantWebpageFuture(inputAssistantString)
//                    .thenApply(HttpResponse::body)
                    .thenAccept(r -> {
                        // Create chatCompletionResponse
                        OAIGPTChatCompletionResponse chatCompletionResponse;

                        try {
                            chatCompletionResponse = new ObjectMapper().readValue(r.body(), OAIGPTChatCompletionResponse.class);
                        } catch (IOException e) {
                            System.out.println("Exception when transforming response value to OAIGPTChatCompletionResponse..");
                            e.printStackTrace();
                            throw new RuntimeException(e);
                        }

                        // Deserialize to GenerateAssistantWebpageFC
                        GenerateAssistantWebpageFC generateAssistantWebpageFC;

                        try {
                            generateAssistantWebpageFC = OAIFunctionCallDeserializer.deserialize(chatCompletionResponse.getChoices()[0].getMessage().getFunction_call().getArguments(), GenerateAssistantWebpageFC.class);
                        } catch (OAIDeserializerException e) {
                            System.out.println("Exception when deserializing chat completion response to GenerateAssistantWebpageFC..");
                            e.printStackTrace();
                            throw new RuntimeException(e);
                        }

                        // Transform generateAssistantWebpageFC to Assistant
                        AirtableAssistant airtableAssistant = new AirtableAssistant(
                                generateAssistantWebpageFC.getName(),
                                null,
                                generateAssistantWebpageFC.getSubtitle(),
                                generateAssistantWebpageFC.getShortDescription(),
                                generateAssistantWebpageFC.getMediumDescription(),
                                generateAssistantWebpageFC.getWhoItsForTitle(),
                                generateAssistantWebpageFC.getWhoItsForDescription(),
                                generateAssistantWebpageFC.getWhoItsForExample1(),
                                generateAssistantWebpageFC.getWhoItsForExample2(),
                                generateAssistantWebpageFC.getWhoItsForExample3(),
                                generateAssistantWebpageFC.getWhoItsForExample4(),
                                generateAssistantWebpageFC.getHowToUseTitle(),
                                generateAssistantWebpageFC.getHowToUseStep1(),
                                generateAssistantWebpageFC.getHowToUseStep2(),
                                generateAssistantWebpageFC.getHowToUseStep3(),
                                generateAssistantWebpageFC.getHowToUseDescription4(),
                                generateAssistantWebpageFC.getHowToUseDescription5(),
                                generateAssistantWebpageFC.getFaq1Title(),
                                generateAssistantWebpageFC.getFaq1Description(),
                                generateAssistantWebpageFC.getFaq2Title(),
                                generateAssistantWebpageFC.getFaq2Description(),
                                generateAssistantWebpageFC.getFaq3Title(),
                                generateAssistantWebpageFC.getFaq3Description(),
                                generateAssistantWebpageFC.getFaq4Title(),
                                generateAssistantWebpageFC.getFaq4Description(),
                                generateAssistantWebpageFC.getSystemPrompt(),
                                generateAssistantWebpageFC.getInitialMessage(),
                                generateAssistantWebpageFC.getEmoji(),
                                generateAssistantWebpageFC.getUsageMessages(),
                                generateAssistantWebpageFC.getUsageUsers(),
                                Instant.now().toEpochMilli()
                        );

                        // Send to Airtable
                        try {
                            uploadToAirtable(airtableAssistant);
                        } catch (IOException | InterruptedException e) {
                            System.out.println("Error uploading to airtable..");
                            e.printStackTrace();
                            throw new RuntimeException(e);
                        }
                    });

            // Add responseFuture to responseFutures
            responseFutures.add(responseFuture);
        }

        // Wait for all responseFutures to complete
        CompletableFuture.allOf(responseFutures.toArray(new CompletableFuture[0])).join();
    }

    public static CompletableFuture<HttpResponse<String>> getGenerateAssistantWebpageFuture(String text) throws OAISerializerException, IOException {
        // Create message with text
        OAIChatCompletionRequestMessage message = new OAIChatCompletionRequestMessageBuilder(CompletionRole.USER)
                .addText(text)
                .build();

        // Create HttpClient
        final HttpClient httpClient = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).connectTimeout(Duration.ofMinutes(com.oaigptconnector.Constants.AI_TIMEOUT_MINUTES)).build();

        // Get the function call name from GenerateAssistantWebpageFC using OAIFunctionCallSerializer
        String functionCallName = OAIFunctionCallSerializer.getFunctionName(GenerateAssistantWebpageFC.class);

        // Create requestFunctionCall
        OAIChatCompletionRequestFunctionCall requestFunctionCall = new OAIChatCompletionRequestFunctionCall(functionCallName);

        // Create OAIChatCompletionRequest
        OAIChatCompletionRequest requestObject = OAIChatCompletionRequest.build(
                OpenAIGPTModels.GPT_4.getName(),
                4000,
                1,
                List.of(message),
                requestFunctionCall,
                List.of(OAIFunctionCallSerializer.objectify(GenerateAssistantWebpageFC.class))
        );

        // Create request
        String requestString = (new ObjectMapper()).writeValueAsString(requestObject);
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofString(requestString))
                .uri(Constants.OPENAI_CHAT_COMPLETION_URI)
                .setHeader("Content-Type", "application/json")
                .setHeader("Authorization", "Bearer " + Keys.openAiAPI);

        // Return async future request to create assistant
        return httpClient.sendAsync(
                requestBuilder.build(),
                HttpResponse.BodyHandlers.ofString()
        );

//        // Do function call
//        OAIGPTChatCompletionResponse response = FCClient.serializedChatCompletion(
//                GenerateAssistantWebpageFC.class,
//                OpenAIGPTModels.GPT_4.getName(),
//                4008,
//                1,
//                Keys.openAiAPI,
//                message
//        );
//
//        // Get and return GenerateAssistantWebpageFC from response
//        return OAIFunctionCallDeserializer.deserialize(
//                response.getChoices()[0].getMessage().getFunction_call().getArguments(),
//                GenerateAssistantWebpageFC.class
//        );
    }

//    public static GenerateAssistantWebpageFC generateAssistantWebpage(String text) throws OAISerializerException, OpenAIGPTException, IOException, InterruptedException, OAIDeserializerException {
//        // Create message with text
//        OAIChatCompletionRequestMessage message = new OAIChatCompletionRequestMessageBuilder(CompletionRole.USER)
//                .addText(text)
//                .build();
//
//        // Do function call
//        OAIGPTChatCompletionResponse response = FCClient.serializedChatCompletion(
//                GenerateAssistantWebpageFC.class,
//                OpenAIGPTModels.GPT_4.getName(),
//                4008,
//                1,
//                Keys.openAiAPI,
//                message
//        );
//
//        // Get and return GenerateAssistantWebpageFC from response
//        return OAIFunctionCallDeserializer.deserialize(
//                response.getChoices()[0].getMessage().getFunction_call().getArguments(),
//                GenerateAssistantWebpageFC.class
//        );
//    }

    public static void uploadToAirtable(AirtableAssistant airtableAssistant) throws IOException, InterruptedException {
        // Create HttpClient
        HttpClient client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).connectTimeout(Duration.ofMinutes(5)).build();

        // Put Assistant in an UploadAssistantToAirtableRequest
        UploadAssistantToAirtableRequest request = new UploadAssistantToAirtableRequest(
                List.of(
                    new UploadAssistantToAirtableRequest.Record(airtableAssistant)
                )
        );

        Consumer<HttpRequest.Builder> headerRequestBuilder = r -> r.setHeader("Authorization", "Bearer " + Keys.airtableAPI);

        // Send to Airtable
        JsonNode response = Httpson.sendPOST(
                request,
                client,
                airtableURI,
                headerRequestBuilder
        );

        System.out.println(response);
    }

}