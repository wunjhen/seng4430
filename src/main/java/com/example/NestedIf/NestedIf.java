package com.example.NestedIf;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class NestedIf {


    public String countNestedIfs(File filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        int nestedIfCount = 0;
        boolean insideOuterIf = false;

        while ((line = reader.readLine()) != null) {
            line = line.trim();
            if (line.isEmpty()) continue;

            if (line.contains("if (") && !insideOuterIf) {
                insideOuterIf = true;
            } else if (line.contains("if (") && insideOuterIf) {
                nestedIfCount++;
            } else if (line.startsWith("}") && insideOuterIf) {
                insideOuterIf = false;
            }
        }

        reader.close();
        return "Number of nested if statements in the file: " + nestedIfCount;
    }
}