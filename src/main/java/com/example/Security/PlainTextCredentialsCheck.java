/* Description: This program identifies plaintext credentials that can pose security risks.
 * It outputs the method where these plaintext credentials are located, along with the credentials themselves.
 */

package com.example.Security;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PlainTextCredentialsCheck {
    // Patterns for detecting plain text credentials
    private static final Pattern USERNAME_PATTERN = Pattern.compile("\\busername\\b", Pattern.CASE_INSENSITIVE);
    private static final Pattern PASSWORD_PATTERN = Pattern.compile("\\bpassword\\b", Pattern.CASE_INSENSITIVE);
    private static final Pattern API_KEY_PATTERN = Pattern.compile("\\bapikey\\b", Pattern.CASE_INSENSITIVE);
    public static int securityResult = 0;
    public int credentialsCheck(String programText) {
        securityResult = 0;
        checkFile(programText);
        return securityResult;
    }


    private static void checkFile(String programText) {
        checkLine(programText, USERNAME_PATTERN);
        checkLine(programText, PASSWORD_PATTERN);
        checkLine(programText, API_KEY_PATTERN);
    }

    private static void checkLine(String line, Pattern pattern) {
        Matcher matcher = pattern.matcher(line);
        if (matcher.find()) {
            securityResult++;
        }
    }
}