package LeetCode;

import java.util.Arrays;
import java.util.Scanner;

public class Question75 {
    public static void sortColors(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n-1; i++){
            int min = i;
            for(int j = i+1; j<n ; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            //swap
            int temp = nums[min];
            nums[min] = nums[i];
            nums[i] = temp;
            System.out.println("Pass " + (i + 1) +
                    " " + Arrays.toString(nums));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        sortColors(nums);
    }
}
