// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/

/*Find First and Last Position of Element in Sorted Array
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]*/

public class Question34 {
    public static void main(String[] args) {
        int[] nums = { 5, 7, 7, 8, 8, 10 };
        int target = 8;
        int[] result = searchRange(nums, target);
        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
    }

    public static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findFirstOccurrence(nums, target);
        int lastOccurrence = findLastOccurrence(nums, target);
        return new int[] { firstOccurrence, lastOccurrence };
    }

    private static int findFirstOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int firstIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target) {
                right = mid - 1;
                if (nums[mid] == target) {
                    firstIndex = mid;
                }
            } else {
                left = mid + 1;
            }
        }

        return firstIndex;
    }

    private static int findLastOccurrence(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        int lastIndex = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
                if (nums[mid] == target) {
                    lastIndex = mid;
                }
            } else {
                right = mid - 1;
            }
        }

        return lastIndex;
    }
}
