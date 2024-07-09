import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // array of primitive
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        System.out.println(arr[2]);

        // if in array data up to 100 then use for loop
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + n + " numbers: ");
            array[i] = sc.nextInt();
        }

        // //first example
        // for (int i = 0; i < n; i++) {
        // System.out.print(array[i] + " ");
        // }

        // //second example
        // for (int num : array) {
        // System.out.print(num + " ");
        // }

        // thirld exaple
        System.out.println(Arrays.toString(array));

        // in string
        System.out.print("Enter m characters vlaue: ");
        int m = sc.nextInt();
        String[] str = new String[m];
        for (int i = 0; i < m; i++) {
            System.out.print("Enter the " + m + " numbers: ");
            str[i] = sc.next();
        }
        System.out.println(Arrays.toString(str));

        //mofify
        str[1] = "Rahul";
        System.out.println(Arrays.toString(str));
    }
}
