package String;

import java.util.HashMap;
import java.util.HashSet;

public class Question205 {
    public boolean isIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> mapTheCharacter = new HashMap<>();
        HashSet<Character> useCharacter = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char orignal = s.charAt(i);
            char replace = t.charAt(i);

            if (!mapTheCharacter.containsKey(orignal)) {
                if (useCharacter.contains(replace)) {
                    return false;
                }
                mapTheCharacter.put(orignal, replace);
                useCharacter.add(replace);
            } else {
                char mapValue = mapTheCharacter.get(orignal);
                if (mapValue != replace) {
                    return false;
                }
            }
        }
        return true;
    }
}
