package org;

public class PositiveNegativeZero {
    public static void main(String[] args) {
         checkNumber(-2);

    }
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("0");
        }
    }
}


