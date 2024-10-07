package LeetCode;

public class Question229 {

}

/*
 * - Better solution:
 * class Solution {
 * public List<Integer> majorityElement(int[] nums) {
 * int n = nums.length;
 * List<Integer> list = new ArrayList<>();
 * int mm = n / 3;
 * HashMap<Integer, Integer> mapp = new HashMap<>();
 * 
 * for (int i = 0; i < n; i++) {
 * mapp.put(nums[i], mapp.getOrDefault(nums[i], 0) + 1);
 * if (mapp.get(nums[i]) == mm + 1 && !list.contains(nums[i])) {
 * list.add(nums[i]);
 * }
 * }
 * return list;
 * }
 * }
 */