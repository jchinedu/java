public class New {
    public static void main(String[] args) {
        boolean gameon = true;
        int score = 10000;
        int levelcompleted = 8;
        int bonus = 200;
        int finalscore = score;

        johnny(true, 10000, 8, 200);

        score = 1000;
        levelcompleted = 8;
        bonus = 200;

        finalscore = score;
        if (gameon) {
            finalscore += (levelcompleted * bonus);
            System.out.println("your final score was" + finalscore);
        }

//        if (gameon == true) {
//            finalscore += (levelcompleted * bonus);
//            System.out.println("your final score was " + finalscore);
//        }
    }
    public static void johnny(boolean gameon, int score, int levelcompleted, int bonus) {

    int finalscore = score;

        if (gameon == true) {
        finalscore += (levelcompleted * bonus);
        System.out.println("your final score was " + finalscore);}
    }
}
