import java.util.Scanner;

public class SumOfNaturalNumber {
    
    public static int NaturalNumber(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        System.out.print("Enter the number: ");
        n = scanner.nextInt();
        if (n < 0) {
            System.out.print("Enter a positive number");
            System.exit(1);
        }

        int result = NaturalNumber(n);
        System.out.print("Sum of natural numbers till " + n + ": " + result);
        
        scanner.close();
    }
}
