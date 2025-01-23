package org.example;

public class Johnny {
    public static void main(String[] args) {
         double firstVariable = 20;
         double secondVariable = 85;
         double result = (firstVariable + secondVariable) * 100;
          double Remainder = result % 40;

         boolean isZero = (Remainder == 0) ;
         if (isZero) {
             System.out.println("true");}
         if (!isZero) {
             System.out.println("got some remainder");
         }



    }
}