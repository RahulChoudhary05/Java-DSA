//Display all numbers entering by user except multiple of 10
import java.util.*;

public class ContinueStatementExOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                // System.out.println(n + " multiply with 10");
                continue;
            }
            System.out.println(n + " Not multiple with 10");
        } while (true);
    }
}
