package LeetCode;

public class Question26 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[i] != nums[j]){
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        Question26 solution = new Question26();

        int[] nums1 = {1, 1, 2};
        int length1 = solution.removeDuplicates(nums1);
        System.out.println("Output: " + length1 + ", nums = [" + nums1[0] + ", " + nums1[1] + ", _]");
        
        int[] nums2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int length2 = solution.removeDuplicates(nums2);
        System.out.print("Output: " + length2 + ", nums = [");
        for (int i = 0; i < length2; i++) {
            System.out.print(nums2[i]);
            if (i < length2 - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(", _, _, _, _]");
    }
}
