import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import com.example.FogIndex.FogIndexModel;

public class FogIndexModelTest {

    // Test for basic readability text
    @Test
    public void testBasicReadability() {
        String text = FogIndexTest.getBasicReadabilityText();
        double expected = 8.0; // Example expected index, adjust based on expected results
        FogIndexModel fogIndexModel = new FogIndexModel(text);
        int actual = fogIndexModel.calculateFogIndex();
        assertEquals("Basic readability text Fog Index", expected, actual, 0.1);
    }

    // Test for text with complex words
    @Test
    public void testComplexWords() {
        String text = FogIndexTest.getComplexWordsText();
        double expected = 30.0; // Example expected index, adjust based on expected results
        FogIndexModel fogIndexModel = new FogIndexModel(text);
        int actual = fogIndexModel.calculateFogIndex();
        assertEquals("Text with complex words Fog Index", expected, actual, 0.1);
    }

    // Test for text with long sentences
    @Test
    public void testLongSentences() {
        String text = FogIndexTest.getLongSentencesText();
        double expected = 35.0; // Example expected index, adjust based on expected results
        FogIndexModel fogIndexModel = new FogIndexModel(text);
        int actual = fogIndexModel.calculateFogIndex();
        assertEquals("Text with long sentences Fog Index", expected, actual, 0.1);
    }
}
