package org.NDigitSumFinder;

import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler() {
        scanner = new Scanner(System.in);
    }


    public int getNDigitInput() {
        System.out.print("Enter the number of digits (n): ");
        return scanner.nextInt();
    }


    public int getSumInput() {
        System.out.print("Enter the sum: ");
        return scanner.nextInt();
    }
}
