import java.util.Scanner;

public class HollowRectanglePattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows, n: ");
        int n = sc.nextInt();
        System.out.println("Enter the columns, m: ");
        int m = sc.nextInt();

        //outer loop for rows, n
        for (int i=1; i<=n; i++){
            //inner loop for columns, m
            for (int j=1; j<=m; j++){
                //cell -> (i,j)
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
