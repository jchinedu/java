package org ;
public class Chinedu {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 4000;
        int levelcompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("your score is less than 5000 ");
        }else if (score < 1000) {
            System.out.println("your score was less than 1000");
        }else {
                System.out.println("got here");
        }
    }
}
