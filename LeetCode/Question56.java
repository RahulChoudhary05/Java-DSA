package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Question56 {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[0][];

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> merged = new ArrayList<>();

        int[] currentInterval = intervals[0];

        for (int i = 1; i < intervals.length; i++) {
            // If there's an overlap, merge them
            if (currentInterval[1] >= intervals[i][0]) {
                currentInterval[1] = Math.max(currentInterval[1], intervals[i][1]);
            } else {
                // No overlap, add the current interval and update it
                merged.add(currentInterval);
                currentInterval = intervals[i];
            }
        }
        // Add the last interval
        merged.add(currentInterval);

        // Convert the list to a 2D array and return
        return merged.toArray(new int[merged.size()][]);
    }
}
