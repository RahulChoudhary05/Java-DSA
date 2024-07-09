// Print number from 1 to n using While Loop
import java.util.*;

public class WhileLoopExTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int range = sc.nextInt();

        int counter = 1;
        while (counter <= range) {
            System.out.println(counter + " ");
            counter++;
        }
    }
}