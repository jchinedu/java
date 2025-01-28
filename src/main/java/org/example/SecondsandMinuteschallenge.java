package org.example;

public class SecondsandMinuteschallenge {
    public static void main(String[] args) {
        System.out.println(" 1m = " + getDurationString(60) + "s");
        System.out.println("1hr, 2m =" + getDurationString(60 * 60, 60));
        int minutes = 60;
        int hours = 60 * 60;
        int seconds = 1;
    }
    public static double getDurationString(int seconds) {
        if (seconds >= 0) {
            System.out.println("we are good");
        }
        return seconds;

    }
    public static double getDurationString(int minutes, int seconds) {
        if (minutes >= 0) {
            System.out.println("we might be good");
        } else if (seconds <= 59) {
            System.out.println("brag about it then");
        } else
            System.out.println("nice");

        return getDurationString(60*60) + (60);

    }
}
