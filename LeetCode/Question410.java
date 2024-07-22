// https://leetcode.com/problems/split-array-largest-sum/description/

/*Split Array Largest Sum
Given an integer array nums and an integer k, split nums into k non-empty subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.
A subarray is a contiguous part of the array.

Example 1:

Input: nums = [7,2,5,10,8], k = 2
Output: 18
Explanation: There are four ways to split nums into two subarrays.
The best way is to split it into [7,2,5] and [10,8], where the largest sum among the two subarrays is only 18.*/

package LeetCode;
public class Question410 {
    public static void main(String[] args) {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums, k));
    }

    public static int splitArray(int[] nums, int k) {
        int start = 0 ;
        int end = 0;
        for(int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]); // In the end of the loop this will contain the max item from the array(simple linear search)
            end = end + nums[i];//sum of all the value
        }

        //binary search
        while(start < end){
            int mid = start + (end - start)/2;

            //calculate how many pieces you can divide this in with this max sum
            int sum = 0;
            int pieces = 1;
            for(int i = 0; i< nums.length; i++) {
                sum = sum + nums[i];
                if(sum > mid) {
                    sum = nums[i];
                    pieces++;
                }
            }
            if(pieces > k){
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end; // here start == end
    }
}
