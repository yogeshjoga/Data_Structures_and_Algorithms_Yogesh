package Programmming_skills_LeetCode;

public class DayEight {

/*
 * strings lets start
 * 
 */

 //1768. Merge Strings Alternately
 // 1st solution
 public String mergeAlternately(String word1, String word2) {
    int idx1 = 0;
    int idx2 = 0;
    StringBuilder sb = new StringBuilder();
    boolean first = true;
    while (idx1 < word1.length() && idx2 < word2.length()) {
      sb.append(first ? word1.charAt(idx1++) : word2.charAt(idx2++));
      first = !first;
    }
    while (idx1 < word1.length()) {
      sb.append(word1.charAt(idx1++));
    }
    while (idx2 < word2.length()) {
      sb.append(word2.charAt(idx2++));
    }
    return sb.toString();
    }



//1678. Goal Parser Interpretation
// 2nd solution

public String interpret(String command) {
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    while (idx < command.length()) {
      if (command.charAt(idx) == '(') {
        if (command.charAt(idx + 1) == ')') {
          sb.append('o');
          idx++;
        } else {
          idx++;
          while (command.charAt(idx) != ')') {
            sb.append(command.charAt(idx++));
          }
        }
        idx++;
      } else {
        sb.append(command.charAt(idx++));
      }
    }
    return sb.toString();   
    }


// 389. Find the Difference
// 3rd sloution

public char findTheDifference(String s, String t) {
    int[] counter = new int[26];
    for (char c : s.toCharArray()) {
      counter[c - 'a']++;
    }
    for (char c : t.toCharArray()) {
      if (counter[c - 'a'] == 0) {
        return c;
      }
      counter[c - 'a']--;
    }
    return '-';
    }




    public static void main(String[] args) {
        
    }
    
}
