package section02;

public class SecondsAndMinutesChallenge {
    static void main() {
        System.out.println(getDurationString(5000));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) { // validation
            return "Invalid Input";
        }
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) { // validation
            return "Invalid Input";
        }
        int hours = minutes / 60;
        int remainingMinutes = minutes % 60;

        return hours + "H" + remainingMinutes + "min" + seconds + "s";

    }
}
