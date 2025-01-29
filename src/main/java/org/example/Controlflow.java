package org.example;

public class Controlflow {
    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("value was 1");
//        }else if ( value == 2) {
//            System.out.println("value w 2");
//        } else {
//            System.out.println("w not 1 or 2");
//        }
    int switchvalue = 3  ;
    switch (switchvalue) {
        case 1:
            System.out.println("value was 1");
            break;
        case 2:
            System.out.println("value was 2");
            break;
        case 3: case 4: case 5:
            System.out.println("was a 3, a 4, or a 5");
            System.out.println("Actually it was a " + switchvalue);
            break;
        default:
            System.out.println(" was not 1, 2, 3, 4, or 5") ;
            break;
    }
    String month = "APRIL";
    System.out.println(month + " is in the " + getQuarter(month) + "quarter");
    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY1", "MARCH" ->  {
                yield "1st";}
            case "APRIL", "MAY", "JUNE" -> "2nd";
            case "JULY", "AUGUST", " september" -> "3rd";
            case "OCTOBER", "NOVEMBER", "december" -> "4th";
            default -> {
                String badResponse = month + " is bad";
                yield badResponse;
            }
        };
    }
}
