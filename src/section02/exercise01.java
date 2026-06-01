package section02;

public class exercise01 {
    static void main() {
        checkNumber(8);
        checkNumber(0);
        checkNumber(-67);

    }

    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
