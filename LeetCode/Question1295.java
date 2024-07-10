// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/

/*Example 1:

Input: nums = [12,345,2,6,7896]
Output: 2
Explanation: 
12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits.
Example 2:

Input: nums = [555,901,482,1771]
Output: 1 
Explanation: 
Only 1771 contains an even number of digits.
*/


public class Question1295 {
    public static void main(String[] args) {
        int[] nums1 = { 12, 345, 2, 6, 7896 };
        int[] nums2 = { 555, 901, 482, 1771 };

        Solution solution = new Solution();

        int result1 = solution.findNumbers(nums1);
        int result2 = solution.findNumbers(nums2);

        System.out.println("Result 1: " + result1);  // Output: 2
        System.out.println("Result 2: " + result2);  // Output: 1
    }
}

class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (hasEvenNumberOfDigits(nums[i])) {
                count++;
            }
        }
        return count;
    }

    private boolean hasEvenNumberOfDigits(int num) {
        int digits = 0;
        while (num > 0) {
            digits++;
            num /= 10;
        }
        return digits % 2 == 0;
    }

    public int maximumWealth(int[][] accounts1) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'maximumWealth'");
    }
}
