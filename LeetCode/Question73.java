package LeetCode;

class Question73 {
    public void setZeroes(int[][] matrix) {
        // Dimensions of the matrix
        int n = matrix.length;
        int m = matrix[0].length;

        // Marks for the first row and first column
        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row has any zero
        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column has any zero
        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use the first row and column to mark zeroes
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0; // Mark the entire row
                    matrix[0][j] = 0; // Mark the entire column
                }
            }
        }

        // Set matrix elements to zero using the marks
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // Set the first row to zero if needed
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix[0][j] = 0;
            }
        }

        // Set the first column to zero if needed
        if (firstColZero) {
            for (int i = 0; i < n; i++) {
                matrix[i][0] = 0;
            }
        }
    }

    // Example call to test the function
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] matrix = {
            {1, 1, 1},
            {1, 0, 1},
            {1, 1, 1}
        };

        sol.Question73(matrix);

        // Print the modified matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

