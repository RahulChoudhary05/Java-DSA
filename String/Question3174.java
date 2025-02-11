package String;

import java.util.Stack;

public class Question3174 {
    // class Solution {
    // public String clearDigits(String s) {
    // StringBuilder res = new StringBuilder();

    // for (char i : s.toCharArray()) {
    // if (i >= '0' && i <= '9') {
    // if (res.length() > 0) {
    // res.deleteCharAt(res.length() - 1);
    // }
    // } else {
    // res.append(i);
    // }
    // }
    // return res.toString();
    // }
    // }

    public String clearDigits(String s) {
        Stack<Character> res = new Stack<>();

        for (char i : s.toCharArray()) {
            if (Character.isDigit(i)) {
                if (!res.isEmpty()) {
                    res.pop();
                }
            } else {
                res.push(i);
            }
        }
        return String.valueOf(res).replaceAll("[\\[\\], ]", "");
    }
}
