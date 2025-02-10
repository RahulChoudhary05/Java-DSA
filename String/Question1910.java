package String;

public class Question1910 {
    public String removeOccurrences(String s, String part) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            result.append(s.charAt(i));
            if (result.length() >= part.length() &&
                    result.substring(result.length() - part.length()).equals(part)) {
                result.setLength(result.length() - part.length());
            }
        }
        return result.toString();
    }
}
