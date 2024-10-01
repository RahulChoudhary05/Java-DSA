package Sorting.InsertionSort;
import java.util.*;
public class InsertionSort {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        insertionSortCode(arr, n);
    }
    public static void insertionSortCode(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int temp = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > temp) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
            System.out.println("Pass " + i + " " + Arrays.toString(arr));
        }
    }
}
