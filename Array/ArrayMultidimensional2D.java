import java.util.Arrays;
import java.util.Scanner;

public class ArrayMultidimensional2D {
    public static void main(String[] args) {
        /*
         * 123
         * 456
         * 789
         */
        int[][] arr = new int[3][]; // no of row is impotant to fill, not a column

        arr[0] = new int[] { 1, 2, 3 };
        arr[1] = new int[] { 4, 5, 6 };
        arr[2] = new int[] { 7, 8, 9 };

        // Print the full 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        // Allow user to input row and column to update a value
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the row index: ");
        int row = scanner.nextInt();
        System.out.println("Enter the column index: ");
        int col = scanner.nextInt();
        System.out.println("Enter the new value: ");
        int value = scanner.nextInt();

        arr[row][col] = value;

        // Print the updated 2D array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
