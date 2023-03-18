package Programmming_skills;

public class DayFour {

    // day four 1st question
    public int arraySign(int[] nums) {
        // lets understand this solution
    int sign = 1;
    for (final int num : nums) {
      if (num == 0)
        return 0;
      if (num < 0)
        sign = -sign;
    }

    return sign;
  }

    public static void main(String[] args) {
        DayFour dayFour = new DayFour();

    }
    
}
