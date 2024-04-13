package com.assistantgenerator.gpt_function_calls;

import com.oaigptconnector.model.FCParameter;
import com.oaigptconnector.model.FunctionCall;

@FunctionCall(name = "Generate_Assistant_Spec", functionDescription = "Creates an assistant.")
public class GenerateAssistantWebpageFC_Backup_V2 {

    @FCParameter(name = "name", description = "the title of the webpage")
    private String name;

    @FCParameter(name = "subtitle", description = "the subtitle of the webpage")
    private String subtitle;

    @FCParameter(name = "short_description", description = "a short description under the subtitle of the webpage")
    private String shortDescription;

    @FCParameter(name = "medium_description", description = "a medium description that expands on the short description of the assistant")
    private String mediumDescription;

    @FCParameter(name = "who_its_for_title", description = "a title describing who the assistant is for")
    private String whoItsForTitle;

    @FCParameter(name = "who_its_for_description", description = "the description describing who the assistant is for")
    private String whoItsForDescription;

    @FCParameter(name = "who_its_for_example_1", description = "an example demonstrating the applications that one can use the assistant for")
    private String whoItsForExample1;

    @FCParameter(name = "who_its_for_example_2", description = "an example demonstrating the applications that one can use the assistant for")
    private String whoItsForExample2;

    @FCParameter(name = "who_its_for_example_3", description = "an example demonstrating the applications that one can use the assistant for")
    private String whoItsForExample3;

    @FCParameter(name = "who_its_for_example_4", description = "an example demonstrating the applications that one can use the assistant for")
    private String whoItsForExample4;

    @FCParameter(name = "how_to_use_title", description = "the title describing how to use the assistant")
    private String howToUseTitle;

    @FCParameter(name = "how_to_use_description_1", description = "the first description point describing how to use the assistant")
    private String howToUseDescription1;

    @FCParameter(name = "how_to_use_description_2", description = "the second description point describing how to use the assistant")
    private String howToUseDescription2;

    @FCParameter(name = "how_to_use_description_3", description = "the third description point describing how to use the assistant")
    private String howToUseDescription3;

    @FCParameter(name = "how_to_use_description_4", description = "the fourth description point describing how to use the assistant")
    private String howToUseDescription4;

    @FCParameter(name = "how_to_use_description_5", description = "the fifth description point describing how to use the assistant")
    private String howToUseDescription5;

    @FCParameter(name = "faq_1_title", description = "the first title of the first FAQ about the assistant")
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

    public GenerateAssistantWebpageFC_Backup_V2() {

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

    public String getHowToUseDescription1() {
        return howToUseDescription1;
    }

    public String getHowToUseDescription2() {
        return howToUseDescription2;
    }

    public String getHowToUseDescription3() {
        return howToUseDescription3;
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
