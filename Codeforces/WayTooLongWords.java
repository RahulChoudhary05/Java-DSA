import java.util.*;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            String word = sc.next();
            System.out.println(wayTooLongWords(word));
        }
    }

    public static String wayTooLongWords(String word) {
        int len = word.length();

        if (len <= 10) {
            return word;
        } else {
            char firstChar = word.charAt(0);
            char lastChar = word.charAt(len - 1);
            int middleCount = len - 2;
            return firstChar + Integer.toString(middleCount) + lastChar;
        }
    }
}
