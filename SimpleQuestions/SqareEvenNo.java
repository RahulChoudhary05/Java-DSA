//use a list comprehension with a conditional expression to filter and square even number

/* // Python code

number = [1,2,3,4,5,6,7,8,9,10];
smart_result = [x**2 for x in number if x % 2 == 0]
print("Smart result:", smart_result); */

//Java code
import java.util.*;

public class SqareEvenNo {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.print("Smart result: ");
        for (int x : numbers) {
            if (x % 2 == 0) {
                System.out.print(x * x + " ");
            }
        }
    }
}