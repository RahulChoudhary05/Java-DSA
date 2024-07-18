import java.util.Arrays;
import java.util.Scanner;

public class ArrayName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        String[] arr = new String[n];
        String result = PrintName(arr);
        System.out.println("All name: " + result);
    }

    static String PrintName(String[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the " + i + " name: ");
            arr[i] = input.nextLine();
        }
        return Arrays.toString(arr);
    }
}
