package section06;
/*
Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.
EXAMPLE INPUT/OUTPUT:
    getLargestPrime (21); should return 7 since 7 is the largest prime (3 * 7 = 21)
    getLargestPrime (217); should return 31 since 31 is the largest prime (7 * 31 = 217)
    getLargestPrime (0); should return -1 since 0 does not have any prime numbers
    getLargestPrime (45); should return 5 since 5 is the largest prime (3 * 3 * 5 = 45)
    getLargestPrime (-1); should return -1 since the parameter is negative
HINT: Since the numbers 0 and 1 are not considered prime numbers, they cannot contain prime numbers.
 */
public class exercise11 {
    static void main() {
        System.out.println(getLargestPrime(21)); // should return 7
        System.out.println(getLargestPrime(217)); // should return 31
        System.out.println(getLargestPrime(0)); // should return -1
        System.out.println(getLargestPrime(45)); // should return 5
        System.out.println(getLargestPrime(-1)); // should return -1
    }


    public static int getLargestPrime (int number){
        // step1: reject invalid values
        if (number < 2) {
            return -1;
        }

        // step2: store the largest prime factor found
        int largestPrime = -1;

        // step3: check every possible factor
        for (int factor = 2; factor <= number; factor++){
            if (number % factor == 0){
                // step4: check whether that factor is prime
                boolean isPrime = true;

                for (int divisor = 2; divisor < factor; divisor ++){
                    if (factor % divisor == 0){
                        isPrime = false;
                        break;
                    }
                }
                // step5: save if it is prime
                if(isPrime){
                    largestPrime = factor;
                }
            }
        }
        return largestPrime;

    }
}
