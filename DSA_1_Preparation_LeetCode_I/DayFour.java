package DSA_1_Preparation_LeetCode_I;

import java.util.List;

public class DayFour {

    //566. Reshape the Matrix
    //1st solution
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;
        if (m * n != r * c) {
            return mat;
        }
        int[][] result = new int[r][c];
        int rowIdx = 0;
        int colIdx = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                result[i][j] = mat[rowIdx][colIdx++];
                if (colIdx == n) {
                    colIdx = 0;
                    rowIdx++;
                }
            }
        }
        return result;
    }



    // 118. Pascal's Triangle
    // 2nd solution
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    temp.add(1);
                } else {
                    temp.add(result.get(i - 1).get(j - 1) + result.get(i - 1).get(j));
                }
            }
            result.add(temp);
        }
        return result;
    }


    public static void main(String[] args) {
        DayFour dayFour = new DayFour();
       // dayFour.matrixReshape(5);
    }
    
}
