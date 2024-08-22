import java.util.Scanner;

public class GameOfTwoStacks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size of stack a, stack b, and the maximum sum allowed:");
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int maxSum = scanner.nextInt();

        System.out.println("Enter the elements of stack a:");
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        System.out.println("Enter the elements of stack b:");
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = scanner.nextInt();
        }

        System.out.println("Maximum possible score: " + maxScore(a, b, maxSum));
    }

    private static int maxScore(int[] a, int[] b, int maxSum) {
        int i = 0, j = 0, count = 0, sum = 0;

        while (i < a.length && sum + a[i] <= maxSum) {
            sum += a[i++];
            count++;
        }
        while (j < b.length && (i >= 0 || sum + b[j] <= maxSum)) {
            sum += b[j++];
            while (sum > maxSum && i > 0) {
                sum -= a[--i];
            }
            if (sum <= maxSum) {
                count = Math.max(count, i + j);
            }
        }
        return count;
    }
}
