//Keep entering numbers till user enters a multiple of 10
import java.util.*;

public class BreakStatementExOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter the number: ");
            int n = sc.nextInt();
            if (n % 10 == 0) {
                System.out.println(n + " multiply with 10");
                break;
            }
            System.out.println(n + " Not multiple with 10");
        } while (true);
    }
}
