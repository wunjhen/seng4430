package LengthOfIdentifiers;

public class LengthOfIdentifiersModel {
    
    private String programText;

    public LengthOfIdentifiersModel(String programText) {
        this.programText = programText;
    }

    public double calculateAverageIdentifierLength() {
        String[] words = programText.split("\\W+");
        int totalLength = 0;
        for (String word : words) {
            totalLength += word.length();
        }
        return (double) totalLength / words.length;
    }
}
