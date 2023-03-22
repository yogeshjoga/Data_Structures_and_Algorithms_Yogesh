package Programmming_skills_LeetCode;

public class DaySeven {
/*
 * Arrays Day Seven lets solve 
 * complicated Arrays problems 
 * and use the algo's 
 * lets talk about arrays with algos
 * better to solve easy way, if don't know solutions just see the solutions and copy past it 
 * after one 1hr later you can debug and resolve the problems. 
 *  -- No one knows every solution right your not a inventor, so learn from orther's code
 *    - it might be 
 */

 // 1572. Matrix Diagonal Sum
 // 1st solution
 public int diagonalSum(int[][] mat) {
     int n = mat.length;
     int sum = 0;
     for (int i = 0; i < n; i++) {
         sum += mat[i][i] + mat[i][n - i - 1];
     }
     return sum - (n % 2 == 0 ? 0 : mat[n / 2][n / 2]);
 }

//566. Reshape the Matrix
// 2nd solution
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

// this is not my ownlogic, this is for learning i seen this logic github leetcode solutions
// need to learn these things as soon as possible


 public static void main(String[] args) {

 }

}
