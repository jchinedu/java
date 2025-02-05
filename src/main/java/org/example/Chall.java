package org.example;

import java.util.Scanner;

public class Chall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        double sum = 0;
        do {
            System.out.println("enter number #" + counter + ",");
            String nextNumber = scanner.nextLine();
            try {
               // int number = Integer.parseInt(nextNumber);
                double number = Double.parseDouble(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException nfe) {
                System.out.println("invalid number");
            }

        } while (counter <= 5);
        System.out.println("the sum of the 5 numbers = " + sum);
    }
}
