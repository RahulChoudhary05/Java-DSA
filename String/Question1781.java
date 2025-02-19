package String;

public class Question1781 {
    public int getMaxNumber(int[] freq) {
        int maxCount = 0;
        for (int i = 0; i <26; i++) {
            maxCount = Math.max(maxCount, freq[i]);
        }
        return maxCount;
    }

    public int getMinNumber(int[] freq) {
        int minCount = Integer.MAX_VALUE;
        for (int i = 0; i <26; i++) {
            if(freq[i] > 0){
                minCount = Math.min(minCount, freq[i]);
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }

    public int beautySum(String s) {
        int sum = 0;
        for(int i = 0; i < s.length(); i++){
            int[] freq = new int[26];
            for(int j = i; j< s.length(); j++){
                freq[s.charAt(j) - 'a']++;
                int beauty = getMaxNumber(freq) - getMinNumber(freq);
                sum += beauty;
            }
        }
        return sum;
    }
}