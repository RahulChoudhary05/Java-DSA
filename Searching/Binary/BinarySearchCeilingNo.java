/* Ceiling means, smallest element in array greater or equal to target
e: arr={2,4,6,8,10,15,19}
now my target : 12
so ans is 10*/

public class BinarySearchCeilingNo {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 9, 14, 16, 18 };
        int target = 12;
        int result = BinarySearchCode(arr, target);

        if (result != -1) {
            System.out.println("Ceiling number of " + target + " is: " + arr[result]);
        } else {
            System.out.println("Ceiling number not found");
        }
    }

    static int BinarySearchCode(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int result = -1;

        while (start <= end) {
            // find the middle element
            // int middle = (start + end)/2;//integer has a fix sixe, it a problem, might be
            // a possible the (start + end) exceeds the range of int in java

            // better way
            int middle = start + (end - start) / 2;

            if (target < arr[middle]) {
                result = middle; // largest element
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
        return result;
    }
}
