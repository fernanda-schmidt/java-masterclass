package section02;

public class MainChallenge {
    static void main() {

        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        System.out.println("The final score was: " + calculateScore(gameOver, score, levelCompleted, bonus));

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        int newHighScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("The final score was: " + newHighScore);
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {

        int finalScore = score;

        if (gameOver) {
            finalScore += (levelCompleted * bonus);
            finalScore += 1000;
        }

        return finalScore;
    }
}
