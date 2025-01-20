import java.util.*;

public class SwapArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " numbers: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Original Array: " + Arrays.toString(arr));
        swap(arr, 0, 1);
        System.out.println("Array after swap: " + Arrays.toString(arr));
    }

    public static void swap(int arr[], int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }
}