package String;

public class Question1903 {
    public String largestOddNumber(String num) {
        StringBuilder res = new StringBuilder();

        for (int i = num.length() - 1; i >= 0; i--) {
            if (num.charAt(i) % 2 == 1) {
                return num.substring(0, i + 1);
            }
        }
        return "";
    }
}
