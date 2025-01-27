public class New {
    public static void main(String[] args) {

     int highscore =johnny(true, 10000, 8, 200);
        johnny(true,5000,5,100);
        System.out.println("the score is " + highscore);
    }
    public static int johnny(boolean gameon, int score, int levelcompleted, int bonus) {
       int finalscore = score;

        if (gameon) {
        finalscore += (levelcompleted * bonus);
        finalscore += 1000;
        System.out.println("your final score was" + finalscore);
        }
        return finalscore;
    }

}