import java.util.Scanner;

public class PrintNameFunction {
    public static void printMyName(String firstName, String lastName) {
        String fullName = (firstName + " " + lastName);
        System.out.println("My name is " + fullName);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = sc.next();
        System.out.print("Enter your last name: ");
        String lastName = sc.next();

        printMyName(firstName, lastName);
    }
}
