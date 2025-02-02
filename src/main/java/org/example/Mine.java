package org.example;

public class Mine {
    public static void main(String[] args) {
        int n = 4;
        int finishNumber = 20;
        int evencount = 0;
        int oddcount = 0;
        while (n <= finishNumber) {
            n++;
                    if(!isEvenNumber(n)) {
                        oddcount++;
                        continue;
                    }
                    System.out.println("even number " + n);
                    evencount++;
                    if(evencount >= 5)
                        break;
        }
        System.out.println("total odd number fount = " + oddcount);
        System.out.println("total even numbers found = " + evencount);
    }

    public static boolean isEvenNumber(int n) {

            if ((n % 2) == 0) {
                return true;

            } else {
            return false;
        }

    }
}
