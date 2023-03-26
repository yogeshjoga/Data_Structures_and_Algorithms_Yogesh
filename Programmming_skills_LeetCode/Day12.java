package Programmming_skills_LeetCode;

public class Day12 {
/*
 * 
 */


 //1603. Design Parking System
 class ParkingSystem {

    public ParkingSystem(int big, int medium, int small) {
        count = new int[] {big, medium, small};
    }
    
    public boolean addCar(int carType) {
        return count[carType - 1]-- > 0;
    }
    private int[] count;
 } 

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */




//303. Range Sum Query - Immutable
// 2nd solution
class NumArray {

    public NumArray(int[] nums) {
     prefix = new int[nums.length + 1];
     for (int i = 0; i < nums.length; ++i)
       prefix[i + 1] = nums[i] + prefix[i];
   }
 
   public int sumRange(int left, int right) {
     return prefix[right + 1] - prefix[left];
   }
 
   private int[] prefix;
 }
 
 /**
  * Your NumArray object will be instantiated and called as such:
  * NumArray obj = new NumArray(nums);
  * int param_1 = obj.sumRange(left,right);
  */


hello this
  

    public static void main(String[] args) {
        
    }
    
}
