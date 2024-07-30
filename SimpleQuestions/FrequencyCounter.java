//Evaluate the complexity of the developed program , to find the frequency of element in a given array.

import java.util.*;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        countAndDisplayFrequency(arr);
    }

    public static void countAndDisplayFrequency(int[] arr) {
        Set<Integer> processed = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (!processed.contains(arr[i])) {
                int count = 1;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] == arr[i]) {
                        count++;
                    }
                }
                System.out.println(arr[i] + " occurs " + count + " times");
                processed.add(arr[i]);
            }
        }
    }
}
