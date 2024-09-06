/*Given an array nums of size , return the majority element.

The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2 */

import java.util.Scanner;

public class FindMaxElementSpaceComplexity {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int maxElement = arr[0]; // Assume the first element as max initially
        for (int i = 1; i < n; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        System.out.println("The maximum element in the array is: " + maxElement);
    }
}
