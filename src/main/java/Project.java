public class Project {
    public static void main(String[] args) {
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        int finalscore = score;
        if (gameover) {
            finalscore += (levelcompleted * bonus);
            System.out.println("your final score was" + finalscore);
        }
        score = 10000;
        levelcompleted = 8;
        bonus = 200;

        finalscore = score;

        if (gameover) {
            finalscore += (levelcompleted * bonus);
            System.out.println("your final score" + finalscore);
        }
    }
    public static void caculateScore(boolean gameover, int score, int levelcompleted, int bonus) {
        int finalscore = score;
        if (gameover) {
           finalscore += (levelcompleted * bonus);
           System.out.println("your final score was" + finalscore);
        }
    }
}


