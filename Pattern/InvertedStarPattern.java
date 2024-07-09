import java.util.*;

public class InvertedStarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = i; j <= number; j++) { // Inner loop for one line
                System.out.print("*");
                // System.out.print(j);
            }
            System.out.println();
        }
    }
}