package HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionofTwoArraysQuestion349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> set = new HashMap<>();

        for (int n : nums1) {
            set.put(n, 1);
        }
        List<Integer> ans = new ArrayList<>();
        for (int n : nums2) {
            if (set.containsKey(n) && set.get(n) == 1) {
                set.put(n, 0);
                ans.add(n);
            }
        }
        int[] result = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            result[i] = ans.get(i);
        }
        return result;
    }
}
