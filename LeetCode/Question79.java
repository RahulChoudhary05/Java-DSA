//https://leetcode.com/problems/word-search/description/

/*Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

Example 1:
Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true*/

package LeetCode;
import java.util.Scanner;

public class Question79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows in the board:");
        int m = scanner.nextInt();
        System.out.println("Enter the number of columns in the board:");
        int n = scanner.nextInt();

        char[][] board = new char[m][n];

        System.out.println("Enter the characters for the board:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = scanner.next().charAt(0);
            }
        }

        System.out.println("Enter the word to search for:");
        String word = scanner.next();

        Question79 solution = new Question79();
        boolean exists = solution.exist(board, word);

        System.out.println("Does the word exist in the board? " + exists);
    }

    public boolean exist(char[][] board, String word) {
        if (board == null || board.length == 0 || board[0].length == 0 || word == null || word.length() == 0) {
            return false;
        }

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (dfs(board, i, j, word, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean dfs(char[][] board, int i, int j, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] != word.charAt(index)) {
            return false;
        }

        char temp = board[i][j];
        board[i][j] = ' '; // Mark it as visited

        boolean found = dfs(board, i + 1, j, word, index + 1)
                || dfs(board, i - 1, j, word, index + 1)
                || dfs(board, i, j + 1, word, index + 1)
                || dfs(board, i, j - 1, word, index + 1);

        board[i][j] = temp; // Reset the value

        return found;
    }
}

