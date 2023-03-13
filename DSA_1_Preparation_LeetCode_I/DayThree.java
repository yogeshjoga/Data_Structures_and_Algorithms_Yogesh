package DSA_1_Preparation_LeetCode_I;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DayThree {

    // this is not working try another way
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        int j =0;
        for(int i=0; i<arr.length-1; i++){
          //  if(nums2.length >= nums2.length){
                  if(nums1[i] == nums2[j]){
                      arr[j] =nums1[i];
                          j++;
                  }
                  
           // }
        }
        int[] arr1 = new int[j-1];
        for(int k=0; k<j-1; k++){
            arr1[k] = nums1[j];
        }
       
        return arr;
    }

    // this is from solution section need to learn Hashmap------very importent
    public int[] intersectTest(int[] nums1, int[] nums2) {
        int len = Math.min(nums1.length, nums2.length);
       int[] arr = new int[len];
       if (len == 0) return arr;

       Map<Integer, Integer> m1 = new HashMap<>();
       for (int i=0; i<nums1.length; i++) {
           m1.put(nums1[i], m1.getOrDefault(nums1[i], 0)+1);
       }

       int size = 0;
       for (int i=0; i<nums2.length; i++) {
           if (m1.containsKey(nums2[i]) && m1.get(nums2[i]) > 0) {
               m1.put(nums2[i], m1.get(nums2[i])-1);
               arr[size] = nums2[i];
               size++;
           }
       }

       return Arrays.copyOfRange(arr, 0, size);
   }

    public static void main(String[] args) {
        DayThree dayThree = new DayThree();
        int[] nums1 ={1,2,2,3};
        int[] nums2 = {2,2};
       // dayThree.intersect(nums1, nums2);
        dayThree.intersectTest(nums1, nums2);
    }
    
}
