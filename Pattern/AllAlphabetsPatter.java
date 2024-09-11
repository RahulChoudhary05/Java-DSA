import java.util.*;

public class AllAlphabetsPatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first char where you want to start: ");
        char firstChar = sc.next().charAt(0);
        System.out.print("Enter the Second char where you want to end: ");
        char secondChar = sc.next().charAt(0);
        for (char ch = firstChar; ch <= secondChar; ch++) {
            System.out.print(ch + " ");
        }
    }
}