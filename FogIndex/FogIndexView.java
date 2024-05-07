package FogIndex;


import java.util.Scanner;

public class FogIndexView {
    private Scanner scanner;

    public FogIndexView() {
        this.scanner = new Scanner(System.in);
    }

    public String getInput() {
        System.out.println("Enter the text of the document:");
        return scanner.nextLine();
    }

    public void displayFogIndex(double index) {
        System.out.printf("The Fog Index of the document is: %.2f%n", index);
    }
}

