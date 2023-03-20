package DSA_1_Preparation_LeetCode_I;

import java.util.HashSet;
import java.util.Set;

public class DayFive {

/*
 * day five medium arrays 
 * problems slove 
 * lets slove the medium arrays slove 
 * 
 */

//36. Valid Sudoku
// solution 1
 public boolean isValidSudoku(char[][] board) {
    Set seen = new HashSet<>();
    for (int i=0; i<9; ++i) {
        for (int j=0; j<9; ++j) {
            if (board[i][j] != '.') {
                String b = "(" + board[i][j] + ")";
                if (!seen.add(b + i) || !seen.add(j + b) || !seen.add(i/3 + b + j/3))
                    return false;
            }
        }
    }
    return true;
}


//74. Search a 2D Matrix
// medium solution 2
public boolean searchMatrix(int[][] matrix, int target) {
    if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;
   int M = matrix.length;
   int N = matrix[0].length;
   int start = 0;
   int end = M * N - 1;
   while (start < end) {
       int mid = start + (end - start) / 2;
       int midVal = matrix[mid / N][mid % N];
       if (midVal == target) return true;
       if (midVal < target) {
           start = mid + 1;
       } else {
           end = mid - 1;
       }
   }
   return matrix[start / N][start % N] == target;
}

    public static void main(String[] args) {
        
    }
    
}
