//https://leetcode.com/problems/binary-search/

/*Given an array of integers nums which is sorted in ascending order, and an integer target, write a function to search target in nums. If target exists, then return its index. Otherwise, return -1.

You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [-1,0,3,5,9,12], target = 9
Output: 4
Explanation: 9 exists in nums and its index is 4
Example 2:

Input: nums = [-1,0,3,5,9,12], target = 2
Output: -1
Explanation: 2 does not exist in nums so return -1*/

package LeetCode;
import java.util.*;

public class Question704 {
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
