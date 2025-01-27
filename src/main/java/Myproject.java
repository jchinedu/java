public class Myproject {
    public static void main(String[] args) {
        int highscoreposition = calculateHighScorePosition(1500);
        displayHighScorePosition("tim", highscoreposition);
    }
    public static void displayHighScorePosition(String playername, int highscoreposition) {
        System.out.println(playername + " managed to get into position " + highscoreposition + " on the high score list ");
    }
    public static int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
