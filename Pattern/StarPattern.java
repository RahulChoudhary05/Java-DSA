import java.util.*;

public class StarPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //for number
        // System.out.print("Enter a rows number: ");
        // int number = sc.nextInt();
        // forNumber(number);

        //for alphabet char
        System.out.print("Enter the first char: ");
        char firstChar = sc.next().charAt(0);
        System.out.print("Enter the Second char: ");
        char secondChar = sc.next().charAt(0);
        forChar(firstChar, secondChar);
    }

    // public static int forNumber(int number){
    //     for (int i = 1; i <= number; i++) {
    //         for (int j = 1; j <= number; j++) {
    //             System.out.print(j);
    //         }
    //         System.out.println();
    //     }
    //     return 0;
    // }

    public static char forChar(char firstChar, char secondChar){
        for (char i = firstChar; i <= secondChar; i++) {
            for (char j = firstChar; j <= secondChar; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
        return 0;
    }
}