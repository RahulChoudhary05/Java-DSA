import java.util.*;

public class BalancedBrackets {

    public static String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();
        for (char bracket : s.toCharArray()) {
            if (bracket == '(' || bracket == '{' || bracket == '[') {
                stack.push(bracket);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(') ||
                    (bracket == '}' && top != '{') ||
                    (bracket == ']' && top != '[')) {
                    return "NO";
                }
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of strings of brackets: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        for (int i = 0; i < n; i++) {
            System.out.print("Enter brackets string " + (i + 1) + ": ");
            String brackets = scanner.nextLine();
            System.out.println(isBalanced(brackets));
        }

        scanner.close();
    }
}
