// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/

/*Peak Index in a Mountain Array
You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
Return the index of the peak element.
Your task is to solve it in O(log(n)) time complexity.

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1

Example 3:
Input: arr = [0,10,5,2]
Output: 1*/

// Question 162 is same done👍

package LeetCode;
public class Question852 {
    public static void main(String[] args) {
        int[] arr1 = { 0, 1, 0 };
        int[] arr2 = { 0, 2, 1, 0 };
        int[] arr3 = { 0, 10, 5, 2 };

        System.out.println(BinarySearchCode(arr1));
        System.out.println(BinarySearchCode(arr2));
        System.out.println(BinarySearchCode(arr3));
    }

    static int BinarySearchCode(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start; // or return right, as both will be the same at this point
    }
}