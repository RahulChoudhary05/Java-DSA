import java.util.*;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows(n): ");
        int n = sc.nextInt();

        // upper half
        for (int i = 1; i <= n; i++) {
            // 1st part *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }

        // lower half
        for (int i = n; i >= 1; i--) {
            // 1st part *
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            // space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //2nd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
