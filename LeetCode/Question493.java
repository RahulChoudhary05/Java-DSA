package LeetCode;

import java.util.ArrayList;

public class Question493 {
    static int merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        int cnt = 0;
        int j = mid + 1;
        for (int i = low; i <= mid; i++) {
            while (j <= high && (long) arr[i] > 2L * arr[j]) {
                j++;
            }
            cnt += (j - (mid + 1));
        }

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return cnt;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int cnt = 0;
        if (low >= high)
            return cnt;
        int mid = (low + high) / 2;
        cnt += mergeSort(arr, low, mid);
        cnt += mergeSort(arr, mid + 1, high);
        cnt += merge(arr, low, mid, high);
        return cnt;
    }

    static int reversePairs(int nums[]) {
        int n = nums.length;
        return mergeSort(nums, 0, n - 1);
    }
}
