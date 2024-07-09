import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        // sorted array
        int[] arr = { -19, -15, -12, 2, 17, 19, 22, 67, 69, 200 };
        int target = 69;
        int result = BinarySearchCode(arr, target);
        String notFound = "Element not found";
        // Pass the notFound string as well
        if (result == -1) {
            System.out.println(notFound); // If result is -1, print the notFound message
        } else {
            System.out.println("Here is the index number of " + target + " value is: " + result);
        }
    }

    // return the index
    // return -1 is don't exist
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
