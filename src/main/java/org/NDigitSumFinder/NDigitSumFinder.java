package org.NDigitSumFinder;

import java.util.List;

public class NDigitSumFinder {

    public static void main(String[] args) {
        InputHandler inputHandler = new InputHandler();
        ResultPrinter resultPrinter = new ResultPrinter();

        int n = inputHandler.getNDigitInput();
        int sum = inputHandler.getSumInput();

        NumberGenerator generator = new NumberGenerator();
        List<String> results = generator.findNDigitNumbersWithSum(n, sum);

        resultPrinter.printResults(n, sum, results);
    }
}
