package String;

import java.util.HashMap;
import java.util.Map;

class Question1079 {
    int count = 0;

    public int numTilePossibilities(String tiles) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        for (int i = 0; i < tiles.length(); i++) {
            char c = tiles.charAt(i);
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }

        backtrack(charCount, 0);
        return count;
    }

    private void backtrack(Map<Character, Integer> charCount, int length) {
        if (length > 0) {
            count++;
        }

        for (int i = 'A'; i <= 'Z'; i++) {
            char c = (char)i;
            if (charCount.containsKey(c) && charCount.get(c) > 0) {
                charCount.put(c, charCount.get(c) - 1);
                backtrack(charCount, length + 1);
                charCount.put(c, charCount.get(c) + 1);
            }
        }
    }
}
