package org.example;

public class Parsing {
    public static void main(String[] args) {

        int currentYear = 2022;
        System.out.println(getInputFromconsole(currentYear));
        System.out.println(getinputFromScanner(currentYear));

    }
//        String userDateofBirth = "1999";
//        int dateofBirth = Integer.parseInt(userDateofBirth);
//         System.out.println("Age = " + (currentYear - dateofBirth));
//           String usersAgewithpartialyear = "22.5";
//           double agewithpartialyear = Double.parseDouble(usersAgewithpartialyear);
//           System.out.println("the user says he's " + agewithpartialyear);


//  }
        public static String getInputFromconsole(int currentyear) {
        String name = System.console().readLine("hi, whats your name? ");
        System.out.println("hi " + name + ", thanks for taking the course");
        String dateofBirth = System.console().readline("what year were you born?");
            int age = currentyear - integer.parseint(dateofBirth);
            return "so you are " + age + " years old";
        }
        public static String getinputFromScanner(int currentyear) {
            return "";
        }
}
