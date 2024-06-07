package com.example;
public class TestCases {
    public static void main(String[] args) {
        // Test Case 1: Plaintext password
        String password = "password123"; // This should be flagged
        System.out.println("PTesting Basic Readability Text:"  );
  
        // Test Case 2: Plaintext username
        String username = "admin"; // This should be flagged
        System.out.println("Fog Index: 10 " );
  
        // Test Case 3: API key
        String apiKey = "abc123xyz"; // This should be flagged
        System.out.println("Testing Text with Complex Words: " );
  
        // Test Case 4: Secret key
        String secretKey = "superSecretKey"; // This should be flagged
        System.out.println("Fog Index: 20 " );
  
        // Test Case 5: Non-sensitive information
        String nonSensitive = "This is a test string."; // This should not be flagged
        System.out.println("Testing Text with Long Sentences: " );
  
        // Test Case 6: Plaintext confidential
        String confidentialInfo = "confidential data"; // This should be flagged
        System.out.println("Fog Index: 20 " );
    }
 }
 