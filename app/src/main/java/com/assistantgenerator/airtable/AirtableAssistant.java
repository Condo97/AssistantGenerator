package com.assistantgenerator.airtable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AirtableAssistant {

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Category")
    private String category;

    @JsonProperty("Subtitle")
    private String subtitle;

    @JsonProperty("ShortDescription")
    private String shortDescription;

    @JsonProperty("MediumDescription")
    private String mediumDescription;

    @JsonProperty("WhoItsForTitle")
    private String whoItsForTitle;

    @JsonProperty("WhoItsForDescription")
    private String whoItsForDescription;

    @JsonProperty("WhoItsForExample1")
    private String whoItsForExample1;

    @JsonProperty("WhoItsForExample2")
    private String whoItsForExample2;

    @JsonProperty("WhoItsForExample3")
    private String whoItsForExample3;

    @JsonProperty("WhoItsForExample4")
    private String whoItsForExample4;

    @JsonProperty("HowToUseTitle")
    private String howToUseTitle;

    @JsonProperty("HowToUseDescription1")
    private String howToUseDescription1;

    @JsonProperty("HowToUseDescription2")
    private String howToUseDescription2;

    @JsonProperty("HowToUseDescription3")
    private String howToUseDescription3;

    @JsonProperty("HowToUseDescription4")
    private String howToUseDescription4;

    @JsonProperty("HowToUseDescription5")
    private String howToUseDescription5;

    @JsonProperty("FAQ1Title")
    private String FAQ1Title;

    @JsonProperty("FAQ1Description")
    private String FAQ1Description;

    @JsonProperty("FAQ2Title")
    private String FAQ2Title;

    @JsonProperty("FAQ2Description")
    private String FAQ2Description;

    @JsonProperty("FAQ3Title")
    private String FAQ3Title;

    @JsonProperty("FAQ3Description")
    private String FAQ3Description;

    @JsonProperty("FAQ4Title")
    private String FAQ4Title;

    @JsonProperty("FAQ4Description")
    private String FAQ4Description;

    @JsonProperty("SystemPrompt")
    private String systemPrompt;

    @JsonProperty("InitialMessage")
    private String initialMessage;

    @JsonProperty("Emoji")
    private String emoji;

    @JsonProperty("UsageMessages")
    private Integer usageMessages;

    @JsonProperty("UsageUsers")
    private Integer usageUsers;

    @JsonProperty("UpdateEpochTime")
    private Long updateEpochTime;

    public AirtableAssistant() {

    }

    public AirtableAssistant(String name, String category, String subtitle, String shortDescription, String mediumDescription, String whoItsForTitle, String whoItsForDescription, String whoItsForExample1, String whoItsForExample2, String whoItsForExample3, String whoItsForExample4, String howToUseTitle, String howToUseDescription1, String howToUseDescription2, String howToUseDescription3, String howToUseDescription4, String howToUseDescription5, String FAQ1Title, String FAQ1Description, String FAQ2Title, String FAQ2Description, String FAQ3Title, String FAQ3Description, String FAQ4Title, String FAQ4Description, String systemPrompt, String initialMessage, String emoji, Integer usageMessages, Integer usageUsers, Long updateEpochTime) {
        this.name = name;
        this.category = category;
        this.subtitle = subtitle;
        this.shortDescription = shortDescription;
        this.mediumDescription = mediumDescription;
        this.whoItsForTitle = whoItsForTitle;
        this.whoItsForDescription = whoItsForDescription;
        this.whoItsForExample1 = whoItsForExample1;
        this.whoItsForExample2 = whoItsForExample2;
        this.whoItsForExample3 = whoItsForExample3;
        this.whoItsForExample4 = whoItsForExample4;
        this.howToUseTitle = howToUseTitle;
        this.howToUseDescription1 = howToUseDescription1;
        this.howToUseDescription2 = howToUseDescription2;
        this.howToUseDescription3 = howToUseDescription3;
        this.howToUseDescription4 = howToUseDescription4;
        this.howToUseDescription5 = howToUseDescription5;
        this.FAQ1Title = FAQ1Title;
        this.FAQ1Description = FAQ1Description;
        this.FAQ2Title = FAQ2Title;
        this.FAQ2Description = FAQ2Description;
        this.FAQ3Title = FAQ3Title;
        this.FAQ3Description = FAQ3Description;
        this.FAQ4Title = FAQ4Title;
        this.FAQ4Description = FAQ4Description;
        this.systemPrompt = systemPrompt;
        this.initialMessage = initialMessage;
        this.emoji = emoji;
        this.usageMessages = usageMessages;
        this.usageUsers = usageUsers;
        this.updateEpochTime = updateEpochTime;
    }

}
