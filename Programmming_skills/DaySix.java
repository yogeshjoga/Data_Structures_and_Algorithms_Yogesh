package Programmming_skills;

import java.util.Arrays;

public class DaySix {
    // Start the DaySix Questions solve
    //ARRAYs concept lets understand the arrays and loops basic math functions 
    // arrays build in functions....

    //1588. Sum of All Odd Length Subarrays
    // 1st solution
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
          int currSum = 0;
          for (int j = i; j < arr.length; j++) {
            currSum += arr[j];
            if ((j - i + 1) % 2 != 0) {
              sum += currSum;
            }
          }
        }
        return sum;
    }

     //283. Move Zeroes
     // 2nd solution 
     public void moveZeroes(int[] nums) {
        int startIdx = 0;
        int endIdx = 0;
        while (endIdx < nums.length) {
          if (nums[endIdx] != 0) {
            nums[startIdx++] = nums[endIdx];
          }
          endIdx++;
        }
        while (startIdx < nums.length) {
          nums[startIdx++] = 0;
        }
    }
    

    // 1672. Richest Customer Wealth
    // 3rd solution
    public int maximumWealth(int[][] accounts) {
        return Arrays.stream(accounts)
        .map(e -> Arrays.stream(e).sum())
        .max(Integer::compareTo)
        .orElse(0);
    }




    public static void main(String[] args) {
        
    }
    
}
