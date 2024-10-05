import java.util.ArrayList;
import java.util.List;

public class Question54 {
    public List<Integer> spiralOrder(int[][] matrix) {
        // Check if the matrix is empty
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new ArrayList<>();
        }

        int row = matrix.length;
        int column = matrix[0].length;
        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = column - 1;
        ArrayList<Integer> ans = new ArrayList<Integer>();

        while (top <= bottom && left <= right) {
            // Ist
            for (int i = left; i <= right; i++) {
                ans.add(matrix[top][i]);
            }
            top++;

            // IInd
            for (int i = top; i <= bottom; i++) {
                ans.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom) {
                // IIIrd
                for (int i = right; i >= left; i--) {
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                // IVth
                for (int i = bottom; i >= top; i--) {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
