package org.example;

public class Methodoverloading {
    public static void main(String[] args) {
        int newScore = calculateScore("tim", 500);
        System.out.println("New score is " + newScore );
        calculateScore(75);
        calculateScore();
    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }
    public static int calculateScore(int score) {
        System.out.println("unnammed player " + " scored " + score + " points ");
        return score * 1000;
    }
    public static int calculateScore() {
        System.out.println("No player name, no player score ");
        return 0;
    }

}
