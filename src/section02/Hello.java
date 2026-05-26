package section02;

public class Hello {
    static void main() {
        System.out.println("Hello, Fernanda!");

        boolean isAlien = true; // video 36
        if (isAlien != false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens.");
        }

        int topScore = 80; // video 37
        if (topScore <= 100) {
            System.out.println("You got the top score!");
        }

        int secondScore = 60; // video 38
        if ((topScore > secondScore) && (topScore < 100)) {
            System.out.println("Greater than second, less than 100.");
        }
        if ((topScore > 90) || (secondScore <= 90)) { // video 39
            System.out.println("One or both is true.");
        }
        int newValue = 50; // video 40
        if (newValue == 50) {
            System.out.println(("this is true."));
        }
        boolean isCar = false;
        if (isCar = true) { // this is an error -> used assign instead of operator -> could also use !isCar to check is false
            System.out.println("this is not supposed to happen");
        }
        // video 41
        String makeOfCar = "BYD";
        boolean isDomestic = makeOfCar == "BYD" ? false : true;
        // a better way to write this would be boolean isDomestic = (makeOfCar != "BYD");

        if (isDomestic) {
            System.out.println("This car is domestic.");
        }

        int ageOfClient = 20;
        String ageText = ageOfClient >= 18 ? "over eighteen" : "still a kid";
        System.out.println("Our client is " + ageText);

        String s = (isDomestic) ? "This car is domestic" : "This car is not domestic";
        System.out.println(s);

    }
}
