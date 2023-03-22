package Data_Structers.Arrays;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.BoldAction;

public class DuplicatedContains {
/**
 * Given an array of integers, find if the array contains any duplicates. Your
 * function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */

 // my Answer is working, but time Complixcity is taken O(n2)
 public boolean containsDuplicate(int[] nums) {
    Arrays.sort(nums);
    for(int i=0; i<=nums.length; i++){
        for(int j=i+1; j<=nums.length-1; j++){
            if(nums[i] == nums[j]){
                return true;
            }
        }
    }
    return false;
}


public boolean duplicate(int[] nums){
    Arrays.sort(nums);
    for(int i=0; i<=nums.length; i++){
        
    }
    return false;
}
    public static void main(String[] args) {
        
    }
    
}
