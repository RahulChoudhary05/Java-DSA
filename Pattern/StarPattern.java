import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows number: ");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) { // Inner loop for one line
                System.out.print("*");
            }
            System.out.println();
        }
    }
}