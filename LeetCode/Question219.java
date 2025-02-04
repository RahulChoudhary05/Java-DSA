package LeetCode;

import java.util.HashMap;
public class Question219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i])) {
                int lastIndex = indexMap.get(nums[i]);
                if (i - lastIndex <= k) {
                    return true;
                }
            }
            indexMap.put(nums[i], i);
        }
        
        return false;
    }
}
