package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

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