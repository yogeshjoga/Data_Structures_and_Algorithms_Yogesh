package Programmming_skills;

import java.util.Arrays;

public class DayThree {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for (int i = nums.length - 3; i >= 0; i--) {
          if (nums[i] + nums[i + 1] > nums[i + 2]) {
            // debugging purpose
            System.out.println(nums[i] + nums[i + 1] + nums[i + 2]);
            return nums[i] + nums[i + 1] + nums[i + 2];
          }
        }
        return 0;
    }
    
    

    public static void main(String[] args) {
        DayThree dayThree = new DayThree();
        int[] nums ={2,1,2};
        dayThree.largestPerimeter(nums);
    }
    
}
