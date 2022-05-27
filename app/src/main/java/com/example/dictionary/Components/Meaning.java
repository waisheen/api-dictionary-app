package com.example.dictionary.Components;

import java.util.List;

public class Meaning {
    String partOfSpeech = "";
    List<Definition> definitions = null;

    public void setPartsOfSpeech(String partsOfSpeech) {
        this.partOfSpeech = partsOfSpeech;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    public String getPartsOfSpeech() {
        return this.partOfSpeech;
    }

    public List<Definition> getDefinitions() {
        return this.definitions;
    }
}
