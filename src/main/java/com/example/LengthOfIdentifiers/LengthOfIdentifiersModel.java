package com.example.LengthOfIdentifiers;;

public class LengthOfIdentifiersModel {
    
    private String programText;

    public LengthOfIdentifiersModel(String programText) {
        this.programText = programText;
    }

    public int calculateAverageIdentifierLength() {
        String[] words = programText.split("\\W+");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return (int) totalLength / words.length;
    }
}
