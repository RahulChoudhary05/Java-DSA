public class LinearSearchFindMaxNo {
    public static void main(String[] args) {
        int[] arr = { 12, 3, -7, 3, 10, 38, -1 };
        int result = LinearSearchCode(arr);
        System.out.println("In full array the minimum value is: " + result);
    }

    // assume arr.length is notequalto zero
    // return the monimum value in the array
    static int LinearSearchCode(int[] arr) {
        int max = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] > max) {
                max = arr[index];
            }
        }
        return max;
    }
}