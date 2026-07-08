package section05;

public class EnhancedSwitchChallenge {
    static void main() {

        System.out.println("Day No #1 is " + printDayOfWeek(1));
        System.out.println("Day No #2 is " + printDayOfWeek(2));
        System.out.println("Day No #3 is " + printDayOfWeek(3));
        System.out.println("Day No #4 is " + printDayOfWeek(4));
        System.out.println("Day No #5 is " + printDayOfWeek(5));
        System.out.println("Day No #6 is " + printDayOfWeek(6));
        System.out.println("Day No #7 is " + printDayOfWeek(7));
        System.out.println("Day No #8 is " + printDayOfWeek(8));
    }

    public static String printDayOfWeek(int day) {

        return switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Not a valid Day";
        };
    }
}
