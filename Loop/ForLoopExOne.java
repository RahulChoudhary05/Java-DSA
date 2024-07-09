// Print Square pattern using for loop
/* ****
   ****
   ****
   **** */

/* import java.util.*;

public class ForLoopExOne {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            System.out.println("****");
        }
    }
} */

// make it different code
import java.util.*;

public class ForLoopExOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows number: ");
        int rows = sc.nextInt();

        System.out.print("Enter a columns number: ");
        int columns = sc.nextInt();

        for (int i = 1; i <= rows; i++) { // Outer loop for the rows
            for (int j = 1; j <= columns; j++) { // Inner loop for the columns
                System.out.print("*");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}