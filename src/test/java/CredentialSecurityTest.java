public class CredentialSecurityTest {

    // Test case to check detection of plain text credentials
    public void testPlainTextCredentials() {
        // Example of embedded plain text credentials that should be detected
        String apiKey = "ABCD-1234-EFGH-5678";  // This should be flagged
        String username = "admin";               // This should be flagged
        String password = "password123";         // This should be flagged

        System.out.println("API Key: " + apiKey);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }

    // Negative test case to ensure no false positives are reported
    public void testNoCredentialsPresent() {
        // No credentials are embedded in this method
        int a = 1;
        int b = 2;
        int result = a + b;

        System.out.println("Result: " + result);  // This should not be flagged
    }

    // Main method to run tests
    public static void main(String[] args) {
        CredentialSecurityTest tester = new CredentialSecurityTest();
        tester.testPlainTextCredentials();
        tester.testNoCredentialsPresent();
    }
}
