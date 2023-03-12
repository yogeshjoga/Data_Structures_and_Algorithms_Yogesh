package DSA_1_Preparation_LeetCode_I;

import java.util.Arrays;

public class DayTwo {
        // Merged sorted array
    public int[] test(int[] nums1, int m, int[] nums2, int n){
        int i = m-1, j = n-1;
        while(i>=0 && j>=0){
          //  nums1[];
        }
        
        
        return nums1;
    }

    public int[] test2(int[] nums1, int m, int[] nums2, int n){
        int m1= m-1, n1= n-1;
        for(int i=0; i<n; i++){
            nums1[m1+1+i]=nums2[i];
        }
        Arrays.sort(nums1);

        for (int i : nums1) {
            System.out.println(i);  
        }
        return nums1;
    }


    public static void main(String[] args) {
        DayTwo dayTwo = new DayTwo();
        int[] nums1 ={1,2,3,4,0,0,0,0};
        int[] nums2 = {2,3,4,0};
        int m =4;
        int n=3;
        dayTwo.test2(nums1, m, nums2, n);
    }
}