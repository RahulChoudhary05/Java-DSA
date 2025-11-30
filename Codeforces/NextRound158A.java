import java.util.*;

public class NextRound158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tagetElement = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[tagetElement - 1] && arr[i] > 0) {
                index++;
            }
        }
        System.out.println(index);
    }
}
