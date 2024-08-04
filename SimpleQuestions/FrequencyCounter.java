//Evaluate the complexity of the developed program , to find the frequency of element in a given array.

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class FrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        
        Map<Integer, Integer> frequencies = new HashMap<>();
        
        for (int i = 0; i < size; i++) {
            int element = array[i];
            if (frequencies.containsKey(element)) {
                frequencies.put(element, frequencies.get(element) + 1);
            } else {
                frequencies.put(element, 1);
            }
        }
    
        System.out.println("Frequency of each element:");
        for (Map.Entry<Integer, Integer> entry : frequencies.entrySet()) {
            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " time(s)");
        }
        
        scanner.close();
    }
}
