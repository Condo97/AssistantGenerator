package com.assistantgenerator.airtable;

import java.util.List;

public class UploadAssistantToAirtableRequest {

    public static class Record {

        private AirtableAssistant fields;

        public Record() {

        }

        public Record(AirtableAssistant fields) {
            this.fields = fields;
        }

        public AirtableAssistant getFields() {
            return fields;
        }

    }

    private List<Record> records;

    public UploadAssistantToAirtableRequest() {

    }

    public UploadAssistantToAirtableRequest(List<Record> records) {
        this.records = records;
    }

    public List<Record> getRecords() {
        return records;
    }

}
