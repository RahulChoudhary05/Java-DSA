package LeetCode;

public class Question1524 {
    public int numOfSubarrays(int[] arr) {
        int count = 0;
        int prefixSum = 0;
        int oddCount = 0;
        int evenCount = 1;
        int result = 0;
        int MOD = 1000000007;
        for (int i = 0; i < arr.length; i++) {
            prefixSum += arr[i];
            if (prefixSum % 2 == 0) {
                result = (result + oddCount) % MOD;
                evenCount++;
            } else {
                result = (result + evenCount) % MOD;
                oddCount++;
            }
        }
        return result;
    }
}
