package Programmming_skills;

public class DayTwo {
  /*
   * Day Two-- 
   * 
   */

// 1st question
   public int hammingWeight(int n) {
    int bits = 0;
    while(n!=0) {
        bits += (n & 1);
        n = n>>>1;
    }
    return bits;
}


public int hammingWeight1(int n) {
    int bits = 0;
    int mask = 1;
    for (int i = 0; i < 32; i++) {
        if ((n & mask) != 0) {
            bits++;
        }
        mask <<= 1;
    }
    return bits;
}

public int hammingWeight2(int n) {
    int bits = 0;
    int mask = 1;
    for (int i = 0; i < 32; i++) {
        if ((n & mask) != 0) {
            bits++;
        }
        n >>= 1;
    }
    return bits;
}

 // you need to treat n as an unsigned value
 public int hammingWeight3(int n) {
    int sum = 0;
    while (n != 0) { // flip the rightmost `1` until  all bits are `0`
        sum++;
        n &= (n - 1); // n = n & (n-1)
    }
    return sum;
}
    public static void main(String[] args) {
        
    }
    
}
