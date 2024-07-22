// Develop a program to evaluate of power function and determine that the complexity should be O(log n)

import java.util.Scanner;

public class RecursiveFunction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        long result = power(base, exponent);
        System.out.println("Result: " + result);
        input.close();
    }

    public static long power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            long temp = power(base, exponent / 2);
            if (exponent % 2 == 0) {
                return temp * temp;
            } else {
                return base * temp * temp;
            }
        }
    }
}
