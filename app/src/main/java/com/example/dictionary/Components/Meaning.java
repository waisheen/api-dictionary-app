package com.example.dictionary.Components;

import java.util.List;

public class Meaning {
    String partsOfSpeech = "";
    List<Definition> definitions = null;

    public void setPartsOfSpeech(String partsOfSpeech) {
        this.partsOfSpeech = partsOfSpeech;
    }

    public void setDefinitions(List<Definition> definitions) {
        this.definitions = definitions;
    }

    public String getPartsOfSpeech() {
        return this.partsOfSpeech;
    }

    public List<Definition> getDefinitions() {
        return this.definitions;
    }
}
