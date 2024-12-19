import java.util.Arrays;

public class MarcsCakewalk {
    public static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        
        long totalMiles = 0;
        
        for (int i = 0; i < calorie.length; i++) {
            totalMiles += (long) Math.pow(2, i) * calorie[calorie.length - 1 - i];
        }
        
        return totalMiles;
    }
    
    public static void main(String[] args) {
        int[] calorie = {5, 10, 7};
        System.out.println(marcsCakewalk(calorie));
    }
}
