import java.util.*;

public class StarSquarePatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines you want to print with number of row:");
        int number = sc.nextInt();
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}