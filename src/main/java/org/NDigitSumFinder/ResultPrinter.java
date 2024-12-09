package org.NDigitSumFinder;

import java.util.List;

public class ResultPrinter {


    public void printResults(int n, int sum, List<String> results) {
        System.out.println("All " + n + "-digit numbers with sum " + sum + ":");
        if (results == null || results.isEmpty()) {
            System.out.println("No result found");
        } else {
            for (String number : results) {
                System.out.println(number);
            }
        }
    }
}
