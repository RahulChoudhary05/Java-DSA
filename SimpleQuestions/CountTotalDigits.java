import java.util.*;

public class CountTotalDigits {
    public static int countDigits(int n){
        int count = 0;
        while(n != 0){
            count++;
            n = n/10;
        }
        return count;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the number: ");
        n = scanner.nextInt();

        int result = countDigits(n);
        System.out.print("Total number of digits in" + n + ": " + result);
    }
}
