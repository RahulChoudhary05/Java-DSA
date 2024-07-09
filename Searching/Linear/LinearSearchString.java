import java.util.*;

public class LinearSearchString {
    public static void main(String[] args) {
        String[] arr = { "Rahul", "Rohan", "Choudhary", "Thakur", "Ram" };
        String target = "Choudhary";
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
    static int LinearSearchCode(String[] arr, String target) {
        if (arr.length == 0) {
            return -1; // Changed from 'return;' to 'return -1;'
        }

        // Run a for loop
        for (int index = 0; index < arr.length; index++) {
            // Check for element at every index if it is equal to the target
            String element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; // Added to cover the case when the target is not found in the loop
    }
}
