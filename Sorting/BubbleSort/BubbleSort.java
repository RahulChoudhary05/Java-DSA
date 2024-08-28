package Sorting.BubbleSort;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void bubblesortcode(int arr[], int n) {
        for (int i = 0; i < n-1; i++) {
            for (int j = 1; j < n-i-1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("Pass " + (i) + " " + Arrays.toString(arr));
        }
    }

    public static void main (String[] args){
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        bubblesortcode(arr, n);
    } 
}