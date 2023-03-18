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
    

    // debug it and learn it
    public int nearestValidPoint(int x, int y, int[][] points) {
      int ans = -1;
      int minDist = Integer.MAX_VALUE;
      // need to understand math class functions and inBuild Methods
      for (int i = 0; i < points.length; ++i) {
        final int dx = x - points[i][0];
        final int dy = y - points[i][1];
        if (dx == 0 || dy == 0) {
          final int dist = Math.abs(dx + dy);
          if (dist < minDist) {
            minDist = dist;
            ans = i;
          }
        }
      }

      return ans;
    }

    public static void main(String[] args) {
        DayThree dayThree = new DayThree();
        int[] nums ={2,1,2};
        dayThree.largestPerimeter(nums);
        dayThree.nearestValidPoint(0, 0, null);
    }
    
}
