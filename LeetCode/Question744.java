// https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/

/*Find Smallest Letter Greater Than Target
You are given an array of characters letters that is sorted in non-decreasing order, and a character target. There are at least two different characters in letters.

Return the smallest character in letters that is lexicographically greater than target. If such a character does not exist, return the first character in letters.

 

Example 1:

Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'.*/

package LeetCode;

public class Question744 {
    public static void main(String[] args) {
        char[] arr = { 'c', 'f', 'j' };
        char target = 'a';
        char result = BinarySearchCode(arr, target);

        if (result != -1) {
            System.out.println("Smallest character grater than " + target + " is: " + arr[result]);
        } else {
            System.out.println("No character found");
        }
    }

    static char BinarySearchCode(char[] arr, char target) {
        int start = 0;
        int end = arr.length - 1;
        char result = '{';

        while (start <= end) {
            char middle = (char) (start + (end - start) / 2);

            if (target < arr[middle]) {
                result = middle; // largest element
                // lise in left side of the array
                end = middle - 1;
            } else if (target > arr[middle]) {
                // lise in right side of the array
                start = middle + 1;
            } else {
                // found the target
                return middle;
            }
        }
        return result == '{' ? arr[0] : result;
    }
}
