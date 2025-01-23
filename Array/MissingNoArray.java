import java.util.*;

public class MissingNoArray {
    public static void main(String[] args) {
        int N = 5;
        int a[] = {1, 2, 4, 5};

        int ans = FindMissingNumberInAnArray(a, N);
        System.out.println("The missing number is: " + ans);
    }
    public static int FindMissingNumberInAnArray(int []a, int N){
        int xor1 = 0, xor2 = 0;

        for (int i = 0; i < N - 1; i++) {
            xor2 = xor2 ^ a[i];
            xor1 = xor1 ^ (i + 1);
        }
        xor1 = xor1 ^ N; 
        return (xor1 ^ xor2);
    }
}
