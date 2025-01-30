package org.example;

public class Primenumberchallenge {
    public static void main(String[] args){
        System.out.println("0 is " + (isprime(0) ? "": "NOT ") + " a prime number");
        System.out.println("1 is " + (isprime(1) ? "": "NOT ") + " a prime number");
        System.out.println("2 is " + (isprime(2) ? "": "NOT ") + " a prime number");
        System.out.println("3 is " + (isprime(3) ? "": "NOT ") + " a prime number");
        System.out.println("8 is " + (isprime(8) ? "": "NOT ") + " a prime number");
        System.out.println("17 is " + (isprime(17) ? "": "NOT ") + " a prime number");

    }
    public static boolean isprime(int wholeNumber) {
        if (wholeNumber <= 2) {
            return (wholeNumber == 2);
        }
        for (int divisor = 2; divisor < wholeNumber; divisor++) {
           if (wholeNumber % divisor == 0) {
               return false;
           }

        }
        return true;  
    }
}
