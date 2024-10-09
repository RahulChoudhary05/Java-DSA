package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if (sum < 0) {
                    j++;
                } else if (sum > 0) {
                    k--;
                } else {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    
                    while (j < k && nums[j] == nums[j - 1]) {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1]) {
                        k--;
                    }
                }
            }
        }
        return ans;
    }
}

/*
 * Brute Force Solution:
 * class Solution {
 * public List<List<Integer>> threeSum(int[] nums) {
 * int n = nums.length;
 * List<List<Integer>> ans = new ArrayList<>();
 * HashSet<List<Integer>> uniqueTriplets = new HashSet<>();
 * 
 * for (int i = 0; i < n; i++) {
 * for (int j = i + 1; j < n; j++) {
 * for (int k = j + 1; k < n; k++) {
 * if (nums[i] + nums[j] + nums[k] == 0) {
 * List<Integer> temp = Arrays.asList(nums[i], nums[j], nums[k]);
 * temp.sort(null);
 * uniqueTriplets.add(temp);
 * }
 * }
 * }
 * }
 * ans.addAll(uniqueTriplets);
 * return ans;
 * }
 * }
 * 
 */

/*
 * Better Solution:
 * class Solution {
 * public List<List<Integer>> threeSum(int[] nums) {
 * int n = nums.length;
 * List<List<Integer>> ans = new ArrayList<>();
 * HashSet<List<Integer>> uniqueTriplets = new HashSet<>();
 * 
 * Arrays.sort(nums);
 * 
 * for (int i = 0; i < n; i++) {
 * int target = -nums[i];
 * HashSet<Integer> hashset = new HashSet<>();
 * 
 * for (int j = i + 1; j < n; j++) {
 * int third = target - nums[j];
 * 
 * if (hashset.contains(third)) {
 * List<Integer> temp = Arrays.asList(nums[i], nums[j], third);
 * uniqueTriplets.add(temp);
 * }
 * hashset.add(nums[j]);
 * }
 * }
 * ans.addAll(uniqueTriplets);
 * return ans;
 * }
 * }
 */