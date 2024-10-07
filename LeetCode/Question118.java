package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class Question118 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangleResult = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            pascalTriangleResult.add(generateRow(i));
        }
        return pascalTriangleResult;
    }
    public List<Integer> generateRow(int row){
        long ans = 1;
        List<Integer> pascalTriangleAns = new ArrayList<>();
        pascalTriangleAns.add(1);
        for(int column = 1; column <= row; column++){
            ans = ans * (row - column + 1) / column;
            pascalTriangleAns.add((int) ans);
        }
        return pascalTriangleAns;
    }
}
