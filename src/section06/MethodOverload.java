package section06;

public class MethodOverload {
    static void main() {
        calculateScore("Tim", 250);
        calculateScore(250);
    }

    public static void calculateScore(String playerName, int playerScore) {
        System.out.println("Player: " + playerName + "\nScore: " + playerScore);
    }

    public static void calculateScore(int playerScore) {
        System.out.println("Score: " + playerScore);
    }
}
