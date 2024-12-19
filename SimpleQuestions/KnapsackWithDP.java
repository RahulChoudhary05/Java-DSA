import java.util.Scanner;

public class KnapsackWithDP {
    public static int knapsack(int capacity, int[] weights, int[] values, int itemCount) {
        int[] dp = new int[capacity + 1];

        for (int i = 0; i < itemCount; i++) {
            for (int w = capacity; w >= weights[i]; w--) {
                dp[w] = Math.max(dp[w], dp[w - weights[i]] + values[i]);
            }
        }

        return dp[capacity];
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items: ");
        int itemCount = scanner.nextInt();

        int[] values = new int[itemCount];
        int[] weights = new int[itemCount];

        System.out.println("Enter the values of the items:");
        for (int i = 0; i < itemCount; i++) {
            values[i] = scanner.nextInt();
        }

        System.out.println("Enter the weights of the items:");
        for (int i = 0; i < itemCount; i++) {
            weights[i] = scanner.nextInt();
        }

        System.out.print("Enter the capacity of the knapsack: ");
        int capacity = scanner.nextInt();

        int maxValue = knapsack(capacity, weights, values, itemCount);
        System.out.println("The maximum value that can be obtained is: " + maxValue);

        scanner.close();
    }
}
