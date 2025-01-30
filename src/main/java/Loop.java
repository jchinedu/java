public class Loop {
    public static void main (String[] args) {
      for (int counter = 1; counter <= 5; counter++ ) {
          System.out.println(counter);
      }
      for (double rate = 2.0; rate <= 5.0; rate++) {
         double interestAmount = calculateinterest(10000.0, rate);
         System.out.println("10,000" + rate + "% interest =" + interestAmount);
    }}
    public static double calculateinterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    }
