package com.subha.test;

/**
 * Created by subhanjan on 16/04/2018.
 */

public class Solution {

    private static final int UPPER_INDEX = 2000000000;
    private static final int LOWER_INDEX = 0;
    private static final int CONSTANT_ONE = 1;

    public int countDivisible(int lowerBound, int upperBound, int divisor) {

        if (validateInput(lowerBound, upperBound, divisor)) {
            return 0;
        }

        if (lowerBound % divisor == 0)
            return (upperBound / divisor) - (lowerBound / divisor) + 1;

        return (upperBound / divisor) - (lowerBound / divisor);
    }


    private boolean validateInput(int lowerBound, int upperBound, int divisor) {
        if (lowerBound < LOWER_INDEX || lowerBound > UPPER_INDEX) {
            return true;
        }
        if (upperBound < LOWER_INDEX || upperBound > UPPER_INDEX) {
            return true;
        }
        if (divisor < CONSTANT_ONE || divisor > UPPER_INDEX) {
            return true;
        }

        return lowerBound > upperBound;

    }
}
