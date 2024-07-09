// Print Reverse of a number using while loop
import java.util.Scanner;

public class WhileLoopExFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to reverse: ");
        int reverse = sc.nextInt();

        while (reverse != 0) {
            int lastDigit = reverse % 10;   // Get the last digit
            System.out.print(lastDigit + " ");
            reverse = reverse / 10;
            // number /= 10; // Remove the last digit from the original number
        }
    }
}
