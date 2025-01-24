public class New {
    public static void main(String[] args) {
        boolean gameon = true;
        int score = 10000;
        int levelcompleted = 8;
        int bonus = 200;
        int finalscore = score;

        if (gameon == true) {
            finalscore += (levelcompleted * bonus);
            System.out.println("your final score was " + finalscore);
        }
    }
}
