package section06;

public class MethodOverloadChallenge {
    static void main() {
        System.out.println(convertToCentimeters(68));
        System.out.println(convertToCentimeters(5, 8));
    }

    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        int totalInches = (feet * 12) + inches;
        return convertToCentimeters(totalInches);
    }
}
