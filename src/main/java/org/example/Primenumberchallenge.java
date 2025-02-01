package org.example;

public class Primenumberchallenge {
    public static void main(String[] args){
        int count = 0;
        for (int i =10; count < 3 && i <= 50; i++) {
            if (isprime(i)) {
                System.out.println("number " + i + " is a prime number ");
                count++;
                if (count == 3){
                    System.out.println("found 3 - exiting for loop");
                    break;
                }

                
            }
        }
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
