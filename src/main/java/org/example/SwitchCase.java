package org.example;

public class SwitchCase {
    public static void main(String[] args) {
        char charValue = 'A';
        switch(charValue){
            case 'A':
                System.out.println("A is able");
                break;
            case 'B':
                System.out.println("B is baker");
                break;
            case 'C':
                System.out.println("C is charlie");
            case 'D':
                System.out.println("D is dog");
                break;
            case 'E':
                System.out.println("E is easy");
                break;
            default:
                System.out.println("letter " + charValue + " was not found in the switch");
                break;
        }

    }



//  public static void nato(char alpha) {
//      String nato = switch (alpha) {
//          case A -> {
//              yield "ABLE";
//          }
//          case B -> "BAKER";
//          case C -> "CHARLIE";
//          case D -> "DOG";
//          case E -> "EASY";
//          default -> "invalid day";
//      }
//      System.out.println(alpha + " stands for " + nato);
//  }
}
