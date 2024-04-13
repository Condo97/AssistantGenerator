package com.assistantgenerator.gpt_function_calls;

import com.oaigptconnector.model.FCParameter;
import com.oaigptconnector.model.FunctionCall;

@FunctionCall(name = "Generate_Assistant_Spec", functionDescription = "Creates an assistant.")
public class GenerateAssistantWebpageFC {

    @FCParameter(name = "name", description = "Specify the title of the assistant's homepage. This title should be catchy yet descriptive to immediately inform visitors about the assistant's purpose.")
    private String name;

    @FCParameter(name = "subtitle", description = "Provide a succinct subtitle that complements the title by giving a bit more context about the assistant's functionality.")
    private String subtitle;

    @FCParameter(name = "short_description", description = "Enter a brief description that appears beneath the subtitle, offering a quick overview of what the assistant does and its primary benefit.")
    private String shortDescription;

    @FCParameter(name = "medium_description", description = "Provide a more detailed explanation that builds on the short description, detailing the assistant's features and key advantages.")
    private String mediumDescription;

    @FCParameter(name = "who_its_for_title", description = "Title for a section describing the target audience of the assistant. Make it specific to the intended users (e.g., 'Ideal for Students and Educators")
    private String whoItsForTitle;

    @FCParameter(name = "who_its_for_description", description = "Describe who can benefit from using the assistant and why it's useful for these users.")
    private String whoItsForDescription;

    @FCParameter(name = "who_its_for_example_1", description = "Provide specific examples illustrating practical applications of the assistant for the intended users.")
    private String whoItsForExample1;

    @FCParameter(name = "who_its_for_example_2", description = "Provide specific examples illustrating practical applications of the assistant for the intended users.")
    private String whoItsForExample2;

    @FCParameter(name = "who_its_for_example_3", description = "Provide specific examples illustrating practical applications of the assistant for the intended users.")
    private String whoItsForExample3;

    @FCParameter(name = "who_its_for_example_4", description = "Provide specific examples illustrating practical applications of the assistant for the intended users.")
    private String whoItsForExample4;

    @FCParameter(name = "how_to_use_title", description = "Title for the instructional section on how to use the assistant effectively.")
    private String howToUseTitle;

    @FCParameter(name = "how_to_use_step_1", description = "The first step is always Download StudyAI App")
    private String howToUseStep1;

    @FCParameter(name = "how_to_use_step_2", description = "The second step tells how to prompt the assistant and includes the ability to Type OR Photograph")
    private String howToUseStep2;

    @FCParameter(name = "how_to_use_step_3", description = "The third step is to click the generate button and the ai assistant will provide a detailed answer for the problem")
    private String howToUseStep3;

    @FCParameter(name = "how_to_use_description_4", description = "The fourth step is to review what's generated to ensure it is up to the user's standards")
    private String howToUseDescription4;

    @FCParameter(name = "how_to_use_description_5", description = "The fifth step tells the user to copy and paste and share the result with others")
    private String howToUseDescription5;

    @FCParameter(name = "faq_1_title", description = "The first title of the first FAQ about the assistant")
    private String faq1Title;

    @FCParameter(name = "faq_1_description", description = "the first description of the first FAQ about the assistant")
    private String faq1Description;

    @FCParameter(name = "faq_2_title", description = "the second title of the second FAQ about the assistant")
    private String faq2Title;

    @FCParameter(name = "faq_2_description", description = "the second description of the first FAQ about the assistant")
    private String faq2Description;

    @FCParameter(name = "faq_3_title", description = "the first title of the first FAQ about the assistant")
    private String faq3Title;

    @FCParameter(name = "faq_3_description", description = "the third description of the third FAQ about the assistant")
    private String faq3Description;

    @FCParameter(name = "faq_4_title", description = "the first title of the first FAQ about the assistant")
    private String faq4Title;

    @FCParameter(name = "faq_4_description", description = "the fourth description of the fourth FAQ about the assistant")
    private String faq4Description;

    @FCParameter(name = "system_prompt", description = "The system prompt to prompt GPT with")
    private String systemPrompt;

    @FCParameter(name = "initial_message", description = "The initial chat message this chatbot assistant sends to the user when they select it.")
    private String initialMessage;

    @FCParameter(name = "emoji", description = "A fitting emoji to represent this assistant") // The best suited emoji for this assistant
    private String emoji;

    @FCParameter(name = "usage_messages", description = "A fitting estimated amount of messages, random number between one hundred thousand and ten million, do not use a rounded number fill all the digits exactly")
    private Integer usageMessages;

    @FCParameter(name = "usage_users", description = "A fitting estimated amount of users assuming each user sends an appropriate amount of messages, random number between one thousand and one million, do not use a rounded number fill all the digits exactly")
    private Integer usageUsers;

    public GenerateAssistantWebpageFC() {

    }

    public String getName() {
        return name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public String getMediumDescription() {
        return mediumDescription;
    }

    public String getWhoItsForTitle() {
        return whoItsForTitle;
    }

    public String getWhoItsForDescription() {
        return whoItsForDescription;
    }

    public String getWhoItsForExample1() {
        return whoItsForExample1;
    }

    public String getWhoItsForExample2() {
        return whoItsForExample2;
    }

    public String getWhoItsForExample3() {
        return whoItsForExample3;
    }

    public String getWhoItsForExample4() {
        return whoItsForExample4;
    }

    public String getHowToUseTitle() {
        return howToUseTitle;
    }

    public String getHowToUseStep1() {
        return howToUseStep1;
    }

    public String getHowToUseStep2() {
        return howToUseStep2;
    }

    public String getHowToUseStep3() {
        return howToUseStep3;
    }

    public String getHowToUseDescription4() {
        return howToUseDescription4;
    }

    public String getHowToUseDescription5() {
        return howToUseDescription5;
    }

    public String getFaq1Title() {
        return faq1Title;
    }

    public String getFaq1Description() {
        return faq1Description;
    }

    public String getFaq2Title() {
        return faq2Title;
    }

    public String getFaq2Description() {
        return faq2Description;
    }

    public String getFaq3Title() {
        return faq3Title;
    }

    public String getFaq3Description() {
        return faq3Description;
    }

    public String getFaq4Title() {
        return faq4Title;
    }

    public String getFaq4Description() {
        return faq4Description;
    }

    public String getSystemPrompt() {
        return systemPrompt;
    }

    public String getInitialMessage() {
        return initialMessage;
    }

    public String getEmoji() {
        return emoji;
    }

    public Integer getUsageMessages() {
        return usageMessages;
    }

    public Integer getUsageUsers() {
        return usageUsers;
    }

}
