package com.example.FogIndex;


public class FogIndexModel {
    private String text;

    public FogIndexModel(String text) {
        this.text = text;
    }

    public int calculateFogIndex() {
        int totalWords = countWords();
        int totalSentences = countSentences();
        int avgSentenceLength = totalWords / (int) totalSentences;
        int complexWords = countComplexWords();

        return (int) (0.4 * (avgSentenceLength + (100 * complexWords / totalWords)));
    }

    private int countWords() {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private int countSentences() {
        String[] sentences = text.split("[.!?]+");
        return sentences.length;
    }

    private int countComplexWords() {
        String[] words = text.split("\\s+");
        int count = 0;
        for (String word : words) {
            if (word.length() > 6) {  // Assuming complex words are more than 6 letters
                count++;
            }
        }
        return count;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}

