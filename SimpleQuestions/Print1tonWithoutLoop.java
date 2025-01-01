import java.util.*;

public class Print1tonWithoutLoop {
    public static void printNumbers(int n) {
        if (n > 0) {
            printNumbers(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the number:");
        int n = sc.nextInt();
        System.out.println("Here is 1 to " + n + " number without using loop:");
        printNumbers(n);
    }
}
