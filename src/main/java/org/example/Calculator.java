package org.example;

public class Calculator {

    public static int sum(final int val1, final int val2) {
        return val1 + val2;
    }

    public static int subtract(final int val1, final int val2) {
        return val1 - val2;
    }

    public static int multiply(final int val1, final int val2) {
        return val1 * val2;
    }

    public static int divide(final int val1, final int val2) {
        if (val2 == 0) {
            throw new IllegalArgumentException("No divide by 0");
        } else {
            return val1 / val2;
        }
    }
}
