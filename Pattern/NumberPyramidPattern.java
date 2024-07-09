import java.util.*;

public class NumberPyramidPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number limit(n): ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // numbers(Print row no by row time's)
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
