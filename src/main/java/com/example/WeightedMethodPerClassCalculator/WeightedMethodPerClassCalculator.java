package com.example.WeightedMethodPerClassCalculator;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class WeightedMethodPerClassCalculator {

    public int value;
    public int calculateWeightedMethodPerClass(File filePath) throws IOException {
        int wmc = 0;
        boolean insideMethod = false;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = reader.readLine()) != null) {
                line = line.trim();

                // Skip comment lines and empty lines
                if (line.startsWith("//") || line.isEmpty()) {
                    continue;
                }

                if (line.startsWith("public") || line.startsWith("private") || line.startsWith("protected")) {
                    // We found the start of a method
                    if (line.contains("(") && line.contains(")") && !line.contains("=")) {
                        wmc++; // Increment WMC for method declaration line
                        insideMethod = true;
                    }
                } else if (insideMethod) {
                    // Increment WMC for non-empty lines inside the method's body
                    if (!line.startsWith("{") && !line.startsWith("}") && !line.startsWith("class")) {
                        wmc++;
                    }
                    // Check if we reached the end of the method
                    if (line.startsWith("}")) {
                        insideMethod = false;
                    }
                }
            }
        }

        return wmc;
    }
}