package com.example.FogIndex;


import java.util.Scanner;

public class FogIndexView {
    private Scanner scanner;

    public FogIndexView() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.println("Enter the text of the document:");
        String input = "";
        while (scanner.hasNext()) {
            input = scanner.next() + input;
        }
        return input;
    }

    public int displayFogIndex(int index) {
        return index;
    }
}

