import java.util.*;

public class MaxArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n value: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter the " + (i + 1) + " numbers: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array: " + Arrays.toString(arr));
        System.out.println("Max value in the array: " + max(arr));
        System.out.println("MaxRange value in the array: " + maxRange(arr, 0, 3));
        System.out.println("Min value in the array: " + min(arr));
    }

    public static int max(int arr[]) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
               max = arr[i];
          }
        }
        return max;
    }

    public static int maxRange(int arr[], int start, int end) {
        int max = arr[start];
        for(int i = start; i < end; i++){
            if(arr[i] > max){
               max = arr[i];
          }
        }
        return max;
    }

    public static int min(int arr[]) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
               min = arr[i];
          }
        }
        return min;
    }
}