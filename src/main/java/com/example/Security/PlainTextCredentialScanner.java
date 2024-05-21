/* Description: This program identifies plaintext credentials that can pose security risks.
 * It outputs the method where these plaintext credentials are located, along with the credentials themselves.
 */

package com.example.Security;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import spoon.Launcher;
import spoon.reflect.declaration.CtClass;
import spoon.reflect.visitor.Query;
import spoon.reflect.visitor.filter.TypeFilter;
 
 public class PlainTextCredentialScanner {
 
     private final LinkedList<Map.Entry<String, List<String>>> credentialsInClasses;
 
     public PlainTextCredentialScanner() {
         credentialsInClasses = new LinkedList<>();
     }
 
     public void scanForPlainTextCredentials(Launcher launcher) {
         for (CtClass<?> classObject : Query.getElements(launcher.getFactory(), new TypeFilter<>(CtClass.class))) {
             List<String> credentials = extractCredentialsFromClass(classObject);
             if (!credentials.isEmpty()) {
                 credentialsInClasses.add(new AbstractMap.SimpleEntry<>(classObject.getSimpleName(), credentials));
             }
         }
     }
 
     public LinkedList<Map.Entry<String, List<String>>> getCredentialsInClasses() {
         return credentialsInClasses;
     }
 
     public List<String> extractCredentialsFromClass(CtClass<?> classObject) {
         List<String> credentials = new ArrayList<>();
         String sourceCode = classObject.toString();
         Matcher matcher = Pattern.compile("\\b((api|key|token|password|secret)?(key|token|phrase|pwd)?|access?(key|token|phrase)|security_?(key|token))\\b\\s*=\\s*[\"'][^\"']*[\"']").matcher(sourceCode);
         while (matcher.find()) {
             credentials.add(matcher.group());
         }
         return credentials;
     }
 }