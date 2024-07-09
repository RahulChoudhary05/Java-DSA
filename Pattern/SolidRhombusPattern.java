import java.util.*;

public class SolidRhombusPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter how many row print(n): ");
        int n = sc.nextInt();

        for(int i =1; i<=n;i++){
            //space
            for (int j=1;j<=n-i; j++){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
