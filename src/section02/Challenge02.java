package section02;

public class Challenge02 {
    static void main() {
        String name = "Tim";
        int position = 2;

        displayHighScorePosition(name, position);

        System.out.println("Percy: " + calculateHighScorePosition(1500));
        System.out.println("Bob: " + calculateHighScorePosition(1000));
        System.out.println("Tim: " + calculateHighScorePosition(500));
        System.out.println("Gilbert: " + calculateHighScorePosition(100));
        System.out.println("James: " + calculateHighScorePosition(25));

    }

    public static void displayHighScorePosition(String name, int position) {
        System.out.println(name + " managed to get into position " + position + " on the high score list.");
    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        } else {
            return 4;
        }
    }
}
