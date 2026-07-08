package section05;

public class SwitchChallenge {
    static void main() {
        System.out.println(toNATO('a'));
    }

    public static String toNATO(char letter) {
        return switch (letter) {
            case 'a' -> "Alpha";
            case 'b' -> "Baker";
            case 'c' -> "Charlie";
            case 'd' -> "Dog";
            case 'e' -> "Easy";
            default -> "Letter not found";
        };
    }
}
