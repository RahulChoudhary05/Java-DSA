import java.util.Scanner;

public class CamelCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string to convert to camel case:");
        String input = scanner.nextLine();

        String camelCaseString = convertToCamelCase(input);
        System.out.println("Camel case string: " + camelCaseString);

        scanner.close();
    }

    public static String convertToCamelCase(String input) {
        StringBuilder camelCase = new StringBuilder();
        boolean capitalizeNext = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                if (capitalizeNext) {
                    camelCase.append(Character.toUpperCase(c));
                    capitalizeNext = false;
                } else {
                    camelCase.append(Character.toLowerCase(c));
                }
            } else {
                capitalizeNext = true;
            }
        }

        return camelCase.toString();
    }
}
