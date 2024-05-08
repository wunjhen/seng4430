package com.example.CyclomaticComplexityCalculator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CyclomaticComplexityCalculator {
    public String calculateCyclomaticComplexity(File selectedFile) throws IOException {
        // Read the file containing the code
        BufferedReader reader = new BufferedReader(new FileReader(selectedFile));
        String line;
        int complexity = 1; // Start with 1 for the single entry point

        while ((line = reader.readLine()) != null) {
            // Check for decision points (P) like if, while, for, [try catch], [else if]. [CC = (E - N + 2P), (P + 1)]
            if (line.contains("if") || line.contains("else") || line.contains("case")
                    || line.contains("for") || line.contains("while") || line.contains("catch")) {
                complexity++; // Increment complexity for each decision point
            }
        }
        reader.close();
        return "Cyclomatic Complexity of the code: " + complexity;
    }
}
