package Programmming_skills_LeetCode;

import java.util.Set;

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

  // day four 2nd question
  public boolean canMakeArithmeticProgression(int[] arr) {
    Set<Integer> seen = new HashSet<>();
   int mi = Integer.MAX_VALUE, mx = Integer.MIN_VALUE, n = arr.length;
  for (int a : arr) {
      mi = Math.min(mi, a);
      mx = Math.max(mx, a);
      seen.add(a);
  }
  int diff = mx - mi;
  if (diff % (n - 1) != 0) {
      return false;
  }
  diff /= n - 1;
  while (--n > 0) {
      if (!seen.contains(mi)) {
          return false;
      }
      mi += diff;
  }
  return true;

}


// 3rd question
public boolean isHappy(int n) {
  if (n == 1 || n == 7)
     return true;
 int sum = n, x = n;
 while(sum > 9) {
     sum = 0;
 // Okay let's Start the learning on it
     while (x > 0) {
         int d = x%10;
         sum += d*d;
         x/=10;
     }
     if (sum == 1)
         return true;
     x = sum;
 }
 if(sum == 7)
     return true;
 return false;
}

//4th question
// day four 4th question solution, lets understand the logic.
public boolean areAlmostEqual(String s1, String s2) {
  StringBuilder input1 = new StringBuilder();
  System.out.println(s1);
  input1.append(s2);
  System.out.println(input1);
  input1.reverse();
  System.out.println(input1);
  s2=input1.toString();
  if(s1.equals(s2)){
    System.out.println(s1.equals(s2));
    return true;
  }  
  return false;
}

// Solution is accepted, LeetCode compiler
public boolean areAlmostEqual1(String s1, String s2) {
    int len1 = s1.length();
     int len2 = s2.length();
     
     if (len1 != len2) {
         return false;
     }
     
     int diffNum = 0;
     int[] idx = new int[2];
     
     for (int i = 0; i < len1; i++) {
         if (s1.charAt(i) != s2.charAt(i)) {
             if (diffNum >= 2) {
                 return false;
             }
             
             idx[diffNum++] = i;
         }
     }
     
     if (diffNum == 0) {
         return true;
     }
     
     if (diffNum == 2) {
         if (s1.charAt(idx[0]) == s2.charAt(idx[1])
             && s1.charAt(idx[1]) == s2.charAt(idx[0])) {
             return true;
         }
     }
     
     return false;
 }



    public static void main(String[] args) {
        DayFour dayFour = new DayFour();
        String s1 = "yogi";
        String s2 = "igoy1";
      //  dayFour.areAlmostEqual(s1, s2);
        dayFour.areAlmostEqual1(s1, s2);
    }
    
}
