package com.example.dictionary;

import org.junit.Test;

import static org.junit.Assert.*;

import com.example.dictionary.Components.APIResponse;
import com.example.dictionary.Components.Definition;
import com.example.dictionary.Components.Meaning;

import java.util.List;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void checkResponse_string() {
        APIResponse response = new APIResponse();
        String testWord = "hello";
        response.setWord(testWord);
        assertEquals(testWord, response.getWord());
    }

    @Test
    public void checkResponse_list() {
        Meaning response = new Meaning();
        Definition def = new Definition();
        List<Definition> testList = List.of(def);
        response.setDefinitions(testList);
        assertEquals(testList, response.getDefinitions());
    }
}