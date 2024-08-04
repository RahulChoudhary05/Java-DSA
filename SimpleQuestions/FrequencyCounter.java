//Evaluate the complexity of the developed program , to find the frequency of element in a given array.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the elements of the array (separate by spaces): ");
        String[] inputElements = scanner.nextLine().split(" ");
        
        Map<Integer, Integer> frequencies = new HashMap<>();

        for (int i = 0; i < inputElements.length; i++) {
            int num = Integer.parseInt(inputElements[i]);
            frequencies.put(num, frequencies.getOrDefault(num, 0) + 1);
        }

        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }

        scanner.close();
    }
}
