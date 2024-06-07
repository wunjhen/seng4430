import static org.junit.Assert.*;

import org.junit.Test;

import com.example.Security.PlainTextCredentialsCheck;

public class PlainTextCredentialsCheckTest {

    @Test
    public void testIsCredentialPlainText() {
        PlainTextCredentialsCheck plainTextCredentialsCheck = new PlainTextCredentialsCheck();
        assertEquals("Basic readability text Fog Index", 1, plainTextCredentialsCheck.credentialsCheck("User Password is c3416369"), 0.1);
    }

    @Test
    public void testWithEmptyString() {
        PlainTextCredentialsCheck plainTextCredentialsCheck = new PlainTextCredentialsCheck();
        assertEquals("Expected false for empty string", plainTextCredentialsCheck.credentialsCheck(""));
    }
    
    @Test
    public void testWithNull() {
        PlainTextCredentialsCheck plainTextCredentialsCheck = new PlainTextCredentialsCheck();
        assertEquals("Expected false for null input", plainTextCredentialsCheck.credentialsCheck(null));
    }
}
