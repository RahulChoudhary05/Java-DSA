import java.util.*;

public class FunctionParameters {
    public static void sayHello() {
        System.out.println("Hello, world!");
        System.out.println("Hello, world!");
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int doubleValue(int c) {
        return c * 2;
    }

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

        sayHello();
        System.out.print("Enter vlaue a abd b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result_add = add(a,b);
        System.out.println("Add a and b: " + result_add);
        System.out.print("Enter vlaue c: ");
        int c = sc.nextInt();
        int result_double = doubleValue(c);
        System.out.println("Result: " + result_double);
    }
}
