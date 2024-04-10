package LengthOfCode;

import java.util.Scanner;

public class LengthOfCodeView {
    private Scanner scanner;

    public LengthOfCodeView() {
        scanner = new Scanner(System.in);
    }

    public String getCodeFromUser() {
        System.out.print("Enter your code: ");
        return scanner.nextLine();
    }

    public void displayResult(int length) {
        System.out.println("Length of the code: " + length);
    }
}
