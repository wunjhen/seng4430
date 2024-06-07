import static org.junit.Assert.*;

import org.junit.Test;

import com.example.LengthOfIdentifiers.LengthOfIdentifiersModel;

public class LengthOfIdentifiersModelTest {

    // Test for very short identifiers
    @Test
    public void testVeryShortIdentifiers() {
        LengthOfIdentifiersModel lengthOfIdentifiersModel = new LengthOfIdentifiersModel("Length of 'a'");
        assertEquals("Length of 'c'", 3, lengthOfIdentifiersModel.calculateAverageIdentifierLength());
    }

    // Test for appropriately lengthed identifiers
    @Test
    public void testAppropriatelyLengthedIdentifiers() {
        LengthOfIdentifiersModel lengthOfIdentifiersModel = new LengthOfIdentifiersModel("Length of 'itemCount'");
        assertEquals("Length of 'itemCount'", 5, lengthOfIdentifiersModel.calculateAverageIdentifierLength());
    }

    // Test for excessively long identifiers
    @Test
    public void testExcessivelyLongIdentifiers() {
        LengthOfIdentifiersModel lengthOfIdentifiersModel = new LengthOfIdentifiersModel("Length of 'numberOfItemsInShoppingCartByCurrentUser'");
        assertEquals("Length of 'numberOfItemsInShoppingCartByCurrentUser'", 16, lengthOfIdentifiersModel.calculateAverageIdentifierLength());
    }
}
