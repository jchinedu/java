package org.example;

public class Simba {
    public static void main(String[] args) {
        System.out.println("Hello, John");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("it is not an alien!");
            System.out.println("And i am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("you got the high score!");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("greater than second top score and less then 100");
        }
    }

}