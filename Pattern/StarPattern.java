import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows number: ");
        int number = sc.nextInt();
        forNumber(number);
    }
    public static int forNumber(int number){
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= number; j++) { // Inner loop for one line
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }
}