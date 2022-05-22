package com.example.dictionary.Components;

import java.util.List;

public class APIResponse {
    String word = "";
    String phonetic = "";
    List<Phonetics> phonetics = null;
    String origin = "";
    List<Meaning> meanings = null;

    public void setWord(String word) {
        this.word = word;
    }

    public void setPhonetic(String phonetic) {
        this.phonetic = phonetic;
    }

    public void setPhonetics(List<Phonetics> phonetics) {
        this.phonetics = phonetics;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public void setMeanings(List<Meaning> meanings) {
        this.meanings = meanings;
    }

    public String getWord() {
        return this.word;
    }

    public String getPhonetic() {
        return this.phonetic;
    }

    public List<Phonetics> getPhonetics() {
        return this.phonetics;
    }

    public String getOrigin() {
        return this.origin;
    }

    public List<Meaning> getMeanings() {
        return this.meanings;
    }
}
