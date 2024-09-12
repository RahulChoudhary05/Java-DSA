import java.util.*;

public class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        int val = 1;
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print(val + " ");
                val++;

            }
            System.out.println();
        }
    }
}