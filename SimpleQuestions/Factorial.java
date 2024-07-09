/* Write a program to find the factorial of any number entered by the user.
(Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
only. We write factorial as n!
So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same) */
import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number to find its factorial: ");
        int number = sc.nextInt();

        long factorial = 1;

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            for (int i = 1; i <= number; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
    }
}
