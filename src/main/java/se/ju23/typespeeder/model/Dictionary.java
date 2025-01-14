/*
 * Class: Dictionary
 * Description: A class that creates a dictionary object.
 * Created by: Kerem Bjävenäs Tazedal
 * Email: kerem.tazedal@iths.se
 * Date: 2024-02-14
 */
package se.ju23.typespeeder.model;

import java.util.ArrayList;

public class Dictionary {
    private String language;
    private ArrayList words;

    public Dictionary(String language) {
        this.language = language;
        this.words = new ArrayList();
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ArrayList getWords() {
        return words;
    }

    public void setWords(ArrayList words) {
        this.words = words;
    }

    public void addWord(String word){
        words.add(word);
    }
}