public class Project {
    public static void main(String[] args){
        boolean gameover = true;
        int score = 800;
        int levelcompleted = 5;
        int bonus = 100;

        int finalscore = score;
        if (gameover) {
            finalscore += (levelcompleted * bonus);
            System.out.println("your final score was" + finalscore);}}}


