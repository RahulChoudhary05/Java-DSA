package String;

public class Question1021 {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        int count = 0;
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);

            if (currentChar == '(') {
                if (count > 0) {
                    ans.append(currentChar);
                }
                count++;
            } else if (currentChar == ')') {
                count--;
                if (count > 0) {
                    ans.append(currentChar);
                }
            }
        }
        return ans.toString();
    }
}
