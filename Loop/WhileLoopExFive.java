// Print Reverse of a number using for loop
import java.util.Scanner;

public class WhileLoopExFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int number = sc.nextInt();

        int reverse = 0;
        while (number > 0) { // !=
            int digit = number % 10; // Get the last digit
            reverse = reverse * 10 + digit; // Append the digit to reverse
            number /= 10; // Remove the last digit from the original number
        }

        System.out.println("Reversed number: " + reverse);
    }
}
