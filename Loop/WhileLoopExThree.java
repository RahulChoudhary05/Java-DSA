// Print sum of first n natural numbers using While Loop
import java.util.*;

public class WhileLoopExThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int range = sc.nextInt();
        int sum = 0;
        int i = 1;
        while (i <= range) {
            sum = sum + i;
            // sum += i;
            i++;
        }
        System.out.println("Sum is: " + sum);
    }
}