package LeetCode;

import java.util.*;

public class Question3066 {
    public int minOperations(int[] nums, int k) {
        PriorityQueue<Long> pq = new PriorityQueue<>();

        for (int i = 0; i < nums.length; i++) {
            pq.add((long) nums[i]);
        }
        int count = 0;

        while (!pq.isEmpty() && pq.peek() < k) {
            long firstSmallNo = pq.poll();
            long secondSmallNo = pq.poll();

            pq.add(firstSmallNo * 2 + secondSmallNo);
            count++;
        }
        return count;
    }
}