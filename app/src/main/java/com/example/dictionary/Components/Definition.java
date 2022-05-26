package com.example.dictionary.Components;

import java.util.List;

public class Definition {
    String definition = "";
    String example = "";
    List<String> synonyms = null;
    List<String> antonyms = null;

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public void setExample(String example) {
        this.example = example;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }

    public String getDefinition() {
        return this.definition;
    }

    public String getExample() {
        return this.example;
    }

    public List<String> getSynonyms() {
        return this.synonyms;
    }

    public List<String> getAntonyms() {
        return this.antonyms;
    }
}
