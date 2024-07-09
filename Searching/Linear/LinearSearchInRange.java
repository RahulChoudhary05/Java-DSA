//Search for 3 in the range of index[1,4], arr = [12,3,-7,3,10,38,-1]

public class LinearSearchInRange {
    public static void main(String[] args) {

        int[] arr = { 12, 9, -7, 3, 10, 38, -1 };
        int start = 1;
        int end = 4;
        int target = 3;
        String notFound = "Element not found";
        int result = LinearSearchCode(arr, target, start, end);
        // Pass the notFound string as well
        if (result == -1) {
            System.out.println(notFound); // If result is -1, print the notFound message
        } else {
            System.out.println("Element found at index: " + result);
        }
    }

    // Search in the array: return the index if the item is found
    // otherwise if the item is not found, return -1
    static int LinearSearchCode(int[] arr, int target, int start, int end) {
        if (arr.length == 0) {
            return -1; // Changed from 'return;' to 'return -1;'
        }

        // Run a for loop
        for (int index = start; index <= end; index++) {
            // Check for element at every index if it is equal to the target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1; // Added to cover the case when the target is not found in the loop
    }
}
