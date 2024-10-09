package LeetCode;

public class Question15 {

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