package LeetCode;

public class Question136 {
    public int singleNumber(int[] nums) {
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {
            ans = ans ^ nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Question136 question = new Question136();
        
        int[] nums1 = {2, 2, 1};
        System.out.println("Input: nums = [2, 2, 1]");
        System.out.println("Output: " + question.singleNumber(nums1)); 
        
        int[] nums2 = {4, 1, 2, 1, 2};
        System.out.println("Input: nums = [4, 1, 2, 1, 2]");
        System.out.println("Output: " + question.singleNumber(nums2));

        int[] nums3 = {1};
        System.out.println("Input: nums = [1]");
        System.out.println("Output: " + question.singleNumber(nums3));
    }
}
