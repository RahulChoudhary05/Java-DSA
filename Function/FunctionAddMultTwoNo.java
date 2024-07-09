import java.util.Scanner;

public class FunctionAddMultTwoNo {
    // public static int addTwoNumbers(int a, int b, int result) {
    //     result = a + b;
    //     return result;
    // }

    public static int addTwoNumbers(int a, int b, int result) {
        result = a * b;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Enter b value: ");
        int b = sc.nextInt();
        int result = 0;
        result = addTwoNumbers(a, b, result);
        System.out.println("The sum of two numbers is: " + result);
    }
}
