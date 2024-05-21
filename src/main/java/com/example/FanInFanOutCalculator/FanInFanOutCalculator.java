package com.example.FanInFanOutCalculator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FanInFanOutCalculator {
    public static int value;
   
    public int FIFOCalculator(File File) {
        int num = 0;
        StringBuilder content = new StringBuilder();
        // Read method calls from the Java file
        Map<String, Set<String>> methodCalls = readMethodCalls(File);

        // Create method objects for each method
        Map<String, Method> methods = createMethods(methodCalls);

        // Calculate and display fan-in and fan-out for each method
        for (Method method : methods.values()) {
            content.append(calculateFanInAndFanOut(method, methods));
            content.append("\n");
            num++;
        }
        return num;
    }

    // Read method calls from Java file
    private static Map<String, Set<String>> readMethodCalls(File fileChooser) {
        Map<String, Set<String>> methodCalls = new HashMap<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileChooser))) {
            String line;
            String currentMethod = null;
            while ((line = reader.readLine()) != null) {
                // Check for method declarations
                Matcher methodDeclarationMatcher = Pattern.compile("\\b(public\\s+\\w+\\s+(\\w+)\\s*\\(.*\\))").matcher(line);
                if (methodDeclarationMatcher.find()) {
                    currentMethod = methodDeclarationMatcher.group(2);
                    methodCalls.put(currentMethod, new HashSet<>()); // Initialize method calls set
                }
                // Check for method calls
                Matcher methodCallMatcher = Pattern.compile("(\\w+)\\s*\\(").matcher(line);
                while (methodCallMatcher.find()) {
                    String methodCall = methodCallMatcher.group(1);
                    if (currentMethod != null && !methodCall.equals(currentMethod)) {
                        methodCalls.get(currentMethod).add(methodCall); // Add method call to current method's set
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return methodCalls;
    }


    // Create Method objects from method calls
    private static Map<String, Method> createMethods(Map<String, Set<String>> methodCalls) {
        Map<String, Method> methods = new HashMap<>();
        for (String methodName : methodCalls.keySet()) {
            methods.put(methodName, new Method(methodName));
        }
        for (Map.Entry<String, Set<String>> entry : methodCalls.entrySet()) {
            String methodName = entry.getKey();
            Set<String> calledMethods = entry.getValue();
            Method method = methods.get(methodName);
            for (String calledMethod : calledMethods) {
                if (methods.containsKey(calledMethod)) {
                    method.addCall(methods.get(calledMethod));
                    methods.get(calledMethod).addCaller(method);
                }
            }
        }
        return methods;
    }

    // Calculate and display fan-in and fan-out for a method
    private static String calculateFanInAndFanOut(Method method, Map<String, Method> allMethods) {
        int fanIn = method.getFanIn();
        int fanOut = method.getFanOut();
        return ("Method " + method.getName() + ": Fan-in = " + fanIn + ", Fan-out = " + fanOut);
    }
}

class Method {
    private final String name;
    private final Set<Method> calls;
    private final Set<Method> callers;

    public Method(String name) {
        this.name = name;
        this.calls = new HashSet<>();
        this.callers = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public Set<Method> getCalls() {
        return calls;
    }

    public Set<Method> getCallers() {
        return callers;
    }

    public void addCall(Method method) {
        calls.add(method);
    }

    public void addCaller(Method method) {
        callers.add(method);
    }

    public int getFanIn() {
        return callers.size();
    }

    public int getFanOut() {
        return calls.size();
    }
}

