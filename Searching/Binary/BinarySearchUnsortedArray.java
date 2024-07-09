import java.util.Arrays;

public class BinarySearchUnsortedArray {
    public static void main(String[] args) {
        // unsorted array
        int[] arr = { 100, -19, -12, 2, 17, 19, 22, -67, 69, -200 };

        // Sort the array in ascending order
        Arrays.sort(arr);
        // Print the sorted array
        System.out.print("Sorted Array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); // Add a new line for clarity

        int target = 22;
        int result = BinarySearchCode(arr, target);

        String notFound = "Element not found";
        if (result == -1) {
            System.out.println(notFound); // If result is -1, print the notFound message
        } else {
            System.out.println("Here is the index number of " + target + " value is: " + result);
        }
    }

    static int BinarySearchCode(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            // find the middle element
            // int middle = (start + end)/2;//integer has a fix sixe, it a problem, might be
            // a possible the (start + end) exceeds the range of int in java

            // better way
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                // lise in left side of the array
                end = middle - 1;
            } else if (target > arr[middle]) {
                // lise in right side of the array
                start = middle + 1;
            } else {
                // found the target
                return middle;
            }
        }
        return -1;
    }
}
