package LeetCode;

public class Question53 {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int n = nums.length;
        int maxi = Integer.MIN_VALUE; 
        for(int i = 0; i < n; i++){
            sum += nums[i];
            if(sum > maxi){
                maxi = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        return maxi;
    }
}
