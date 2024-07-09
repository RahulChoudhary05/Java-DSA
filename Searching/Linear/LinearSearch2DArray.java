import java.util.Arrays;

public class LinearSearch2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 },
                { 10, 20, 5 }
        };
        int target = 5;
        int[] result = LinearSearchCode(arr,target);//formet of return value, which take the {row, column}
        System.out.println("In full 2D array, we find the target value: " + Arrays.toString(result));

        //max value
        int maxValueArray = LinearSearchCodeMax(arr);
        System.out.println("In full 2D array, we finf the max value: " + maxValueArray);

        //min value
        int minValueArray = LinearSearchCodeMin(arr);
        System.out.println("In full 2D array, we finf the min value: " + minValueArray);
    }

    static int[] LinearSearchCode(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column< arr[row].length; column++){
                if(arr[row][column] == target){
                    //found the ans
                    return new int[]{row,column};
                }
            }
        }
        return null;
    }

    //max value
    static int LinearSearchCodeMax(int[][] arr){
        int max = Integer.MIN_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column< arr[row].length; column++){
                if(arr[row][column] > max){
                    //found the ans
                   max = arr[row][column];
                }
            }
        }
        return max;
    }

    //min value
    static int LinearSearchCodeMin(int[][] arr){
        int min = Integer.MAX_VALUE;
        for(int row = 0; row < arr.length; row++){
            for(int column = 0; column< arr[row].length; column++){
                if(arr[row][column] < min){
                    //found the ans
                   min = arr[row][column];
                }
            }
        }
        return min;
    }
}
