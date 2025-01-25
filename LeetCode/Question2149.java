public class Question2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int positiveIndex = 0;
        int negativeIndex = 1;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            if (nums[i] < 0) {
                ans[negativeIndex] = nums[i];
                negativeIndex += 2;
            } else {
                ans[positiveIndex] = nums[i];
                positiveIndex += 1;
            }
        }
        return ans;
    }
}
