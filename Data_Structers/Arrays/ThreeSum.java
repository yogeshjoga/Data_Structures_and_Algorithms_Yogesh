package Data_Structers.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

    // this is MEDIUM type Question so don't touch medium question before 100 easy questions
    // solve minimum 100 easy type questions after jump into medium 
    // once you sloved 100 easy questions, use the algo and logic's what you learn in easy type questions
    public  List<List<Integer>> threeSums(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
         for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                for(int k=j+1; k<len; k++){
                    if(nums[i]+nums[j]+nums[k] == 0){

                    }
                }
            }
         }
        return result;

    }
    




    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {2,3,4,5,6,-3};
        threeSum.threeSums(nums);

    }
}