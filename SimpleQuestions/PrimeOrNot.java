
//check if a number is prime or not - n-2 times
import java.util.*;
// import java.math.*; //sqrtn time(best for high numbers)

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value to check prime or not: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("Entered value is prime");
        } else {
            boolean isPrime = true; // track the no. is prime or not(we assume my no is prime)
            for (int i = 2; i <= n - 1; i++) {
            // for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {// n is a multiple of i(i not equal to 1 or n)
                    isPrime = false;
                }
            }
            if (isPrime == true) {
                System.out.println("Entered value is Prime : " + n);
            } else {
                System.out.println("Entered value is Not Prime : " + n);

            }
        }
    }
}