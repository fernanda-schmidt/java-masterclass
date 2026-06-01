package section02;

public class exercise04 {
    static void main() {
        System.out.println(shouldWakeUp(true, 1));
        ;
        System.out.println(shouldWakeUp(false, 2));
        ;
        System.out.println(shouldWakeUp(true, 8));
        ;
        System.out.println(shouldWakeUp(true, -1));
        ;

    }

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
            return true;
        } else {
            return false;
        }
    }
}
