package LeetCode;
import java.util.*;

import java.util.Scanner;

public class Question189 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the number of rotations: ");
        int d = sc.nextInt();
        RotateArrayCode(arr, n, d);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void RotateArrayCode(int arr[], int n, int d) {
        d = d % n;

        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[(i + d) % n] = arr[i];
        }
        // Copy the rotated array back to the original array
        System.arraycopy(result, 0, arr, 0, n);
    }
}
