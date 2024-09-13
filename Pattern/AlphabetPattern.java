import java.util.*;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first char where you want to start: ");
        char firstChar = sc.next().charAt(0);
        System.out.print("Enter the Second char where you want to end: ");
        char secondChar = sc.next().charAt(0);
        character(firstChar, secondChar);
    }

    public static void character(char firstChar, char secondChar) {
        char currentChar = firstChar;
        for (char i = firstChar; i <= secondChar; i++) {
            for (char j = firstChar; j <= i; j++) {
                if (currentChar > secondChar) {
                    break;
                }
                System.out.print(currentChar + " ");
                currentChar++;
            }
            System.out.println();
            if (currentChar > secondChar) {
                break;
            }
        }
    }
}
