import java.util.Scanner;

public class FunctionCalculateFactorial {
    public static void calculateFactorial(int number) {
        int factorial = 1;
        // loop
        if (number < 0) {
            System.out.println("Factorial of negative number is not possible, Invalid number");
            return;
        }
        for (int i = number; i >= 1; i--) {
            factorial = factorial * i;
        }
        System.out.println(factorial);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        calculateFactorial(number);
    }
}
