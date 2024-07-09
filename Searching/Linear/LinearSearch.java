import java.util.*;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 4, 7, 2, 9, 1, -3, -5, 0 };
        int target = -5;
        String notFound = "Element not found";
        int result = LinearSearchCode(arr, target);
        // Pass the notFound string as well
        if (result == -1) {
            System.out.println(notFound); // If result is -1, print the notFound message
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Search in the array: return the index if the item is found
    // otherwise if the item is not found, return -1
    static int LinearSearchCode(int[] arr, int target) {
        if (arr.length == 0) {
            return -1; // Changed from 'return;' to 'return -1;'
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index if it is equal to the target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; // Added to cover the case when the target is not found in the loop
    }
}
