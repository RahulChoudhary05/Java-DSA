import java.util.Scanner;

public class Frequency {

    public static void findFrequency(int[] arr) {
        int size = arr.length;

        for (int i = 0; i < size; i++) {
            int count = 1;
            if (arr[i] != -1) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                        arr[j] = -1; // Mark as visited
                    }
                }
                System.out.println("Element " + arr[i] + " occurs " + count + " times");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        findFrequency(arr);

        scanner.close();
    }
}
