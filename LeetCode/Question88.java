package LeetCode;

import java.util.Arrays;

public class Question88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int left = m - 1;
        int right = 0;

        while (left >= 0 && right < n) {
            if (nums1[left] > nums2[right]) {
                long temp = nums1[left];
                nums1[left] = nums2[right];
                nums2[right] = (int) temp;
                left--;
                right++;
            } else {
                break;
            }
        }
        Arrays.sort(nums1, 0, m);
        Arrays.sort(nums2);
        System.arraycopy(nums2, 0, nums1, m, n);
    }
}
