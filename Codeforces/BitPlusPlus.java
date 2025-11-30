import java.util.*;

public class BitPlusPlus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        if(sc.hasNextInt()){
            int n = sc.nextInt();
            int x = 0;
            for(int i= 0; i<n; i++){
                String s = sc.next();
                if(s.charAt(1) == '+'){
                    x++;
                }else{
                    x--;
                }
            }
            System.out.println(x);
        }
    }
}
