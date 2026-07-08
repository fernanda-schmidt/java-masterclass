package section06;

public class challenge01 {
    static void main() {
        double num1 = 20.00;
        double num2 = 80.00;
        double step3 = (num1 + num2) * 100;
        double step4 = step3 % 40;

        boolean isNoRemainder = (step4 == 0) ? true : false;

        System.out.println(isNoRemainder);

        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }
    }

}
