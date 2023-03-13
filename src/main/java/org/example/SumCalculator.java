package org.example;

public class SumCalculator {

    public int sum(int steps) {
        int result = 0;

        if (steps == 0) {
            throw new IllegalArgumentException("Zero is incorrect data");
        } else {
            for (int step =1; step<=steps; step++) {
                result = result + step;
            }
            return result;
        }
    }

}
