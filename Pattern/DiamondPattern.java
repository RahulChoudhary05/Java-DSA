import java.util.Scanner;

public class DiamondPattern {
    public static void main(String[] args) {
        char[] letter = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
                'W', 'X', 'Y', 'Z'};
        int letter_number = 0;
        String[] diamond = new String[26];
        System.out.print("Enter a Character between A to Z : ");

        Scanner reader = new Scanner(System.in);
        try {
            char user_letter = Character.toUpperCase(reader.next().charAt(0)); 
            for (int i = 0; i < letter.length; i++) {
                if (letter[i] == user_letter) {
                    letter_number = i;
                    break;
                }
            }
            for (int i = 0; i <= letter_number; i++) {
                diamond[i] = "";
                for (int j = 0; j < letter_number - i; j++) {
                    diamond[i] += " ";
                }

                diamond[i] += letter[i];

                if (letter[i] != 'A') {
                    for (int j = 0; j < 2 * i - 1; j++) {
                        diamond[i] += " ";
                    }
                    diamond[i] += letter[i];
                }
                System.out.println(diamond[i]);
            }
            for (int i = letter_number - 1; i >= 0; i--) {
                System.out.println(diamond[i]);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            reader.close();
        }
    }
}

