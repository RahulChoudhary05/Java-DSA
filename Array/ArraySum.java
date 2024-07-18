import java.util.Scanner;

public class ArraySum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int totalSum=0;

        System.out.println("Enter the enter:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
      for(int i=0;i<arr.length;i++)
      {
        totalSum=totalSum+arr[i];
      }
      System.out.println("Sum of element is :"+totalSum);
        

    }
}