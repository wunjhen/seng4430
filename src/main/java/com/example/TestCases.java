package com.example;
public class TestCases {
    public static void main(String[] args) {
        // Test Case 1: Plaintext password
        String password = "password123"; // This should be flagged
        System.out.println("Password stored in plaintext: " + password);
  
        // Test Case 2: Plaintext username
        String username = "admin"; // This should be flagged
        System.out.println("Username stored in plaintext: " + username);
  
        // Test Case 3: API key
        String apiKey = "abc123xyz"; // This should be flagged
        System.out.println("API Key stored in plaintext: " + apiKey);
  
        // Test Case 4: Secret key
        String secretKey = "superSecretKey"; // This should be flagged
        System.out.println("Secret Key stored in plaintext: " + secretKey);
  
        // Test Case 5: Non-sensitive information
        String nonSensitive = "This is a test string."; // This should not be flagged
        System.out.println("Non-sensitive information: " + nonSensitive);
  
        // Test Case 6: Plaintext confidential
        String confidentialInfo = "confidential data"; // This should be flagged
        System.out.println("Confidential information stored in plaintext: " + confidentialInfo);
    }
 }
 