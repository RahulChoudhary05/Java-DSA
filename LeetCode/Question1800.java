package LeetCode;

public class Question1800 {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = nums[0];
        int currSum = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                currSum += nums[i];
            } else {
                maxSum = Math.max(currSum, maxSum);
                currSum = nums[i];
            }
        }
        return maxSum = Math.max(currSum, maxSum);
    }
}
