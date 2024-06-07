public class FogIndexTest {

    /**
     * Provides a sample text with basic readability.
     * Expected to have a moderate Fog Index score.
     * @return sample text
     */
    public static String getBasicReadabilityText() {
        return "The quick brown fox jumps over the lazy dog. " +
            "This sentence is simple and easy to understand. " +
            "It uses common words and short sentences.";
    }

    /**
     * Provides a sample text with increased complex words.
     * Expected to have a higher Fog Index score due to complexity of words.
     * @return sample text
     */
    public static String getComplexWordsText() {
        return "Anthropology and archaeology are disciplines requiring extensive study. " +
            "Understanding these complex fields involves mastery of multifarious elements and sophisticated terminology.";
    }

    /**
     * Provides a sample text with longer average sentence length.
     * Expected to have a higher Fog Index score due to longer sentences.
     * @return sample text
     */
    public static String getLongSentencesText() {
        return "While the concept may seem straightforward initially, the actual implementation of such methodologies in a real-world scenario " +
            "requires not only thorough understanding but also the ability to apply theoretical knowledge practically, " +
            "which can significantly increase the complexity and depth of any scholarly or professional undertaking.";
    }

    public static void main(String[] args) {
        System.out.println("Testing Basic Readability Text:");
        System.out.println(getBasicReadabilityText());

        System.out.println("\nTesting Text with Complex Words:");
        System.out.println(getComplexWordsText());

        System.out.println("\nTesting Text with Long Sentences:");
        System.out.println(getLongSentencesText());
    }
}
