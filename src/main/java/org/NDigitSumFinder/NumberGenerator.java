package org.NDigitSumFinder;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {

    public List<String> findNDigitNumbersWithSum(int n, int sum) {
        List<String> result = new ArrayList<>();
        char[] currentNumber = new char[n];
        generateNumbersRecursive(n, sum, 0, currentNumber, result);
        return result;
    }


    private void generateNumbersRecursive(int n, int sum, int position, char[] currentNumber, List<String> result) {
        if (position == n) {
            if (sum == 0) {
                result.add(new String(currentNumber));
            }
            return;
        }

        int startDigit = (position == 0) ? 1 : 0;

        for (int digit = startDigit; digit <= 9; digit++) {
            if (digit <= sum) {
                currentNumber[position] = (char) (digit + '0');
                generateNumbersRecursive(n, sum - digit, position + 1, currentNumber, result);
            }
        }
    }
}
