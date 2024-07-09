public class LinearSearchFindMinNo {
    public static void main(String[] args) {
        int[] arr = { 12, 3, -7, 3, 10, 38, -5 };
        int result = LinearSearchCode(arr);
        System.out.println("In full array the minimum value is: " + result);
    }

    // assume arr.length is notequalto zero
    // return the monimum value in the array
    static int LinearSearchCode(int[] arr) {
        int min = arr[0];
        for (int index = 1; index < arr.length; index++) {
            if (arr[index] < min) {
                min = arr[index];
            }
        }
        return min;
    }
}