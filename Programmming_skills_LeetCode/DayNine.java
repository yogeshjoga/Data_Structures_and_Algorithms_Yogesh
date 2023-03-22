package Programmming_skills_LeetCode;

import java.util.HashMap;
import java.util.Map;

public class DayNine {
/*
 * Strings --> string handling questions need to solve
 * 
 */

// 709. To Lower Case
// 1st solution
public String toLowerCase(String s) {
    return s.toLowerCase();
 }


 public String toLowerCase2(String str) {
    char[] a = str.toCharArray();
    for (int i = 0; i < a.length; i++)
        if ('A' <= a[i] && a[i] <= 'Z')
            a[i] = (char) (a[i] - 'A' + 'a');
    return new String(a);
}

//1309. Decrypt String from Alphabet to Integer Mapping
// 2nd solution
public String freqAlphabets(String s) {
    StringBuilder sb = new StringBuilder();
    int idx = 0;
    int n = s.length();
    while (idx < n) {
      char c = s.charAt(idx);
      int asciiAdd = -1;
      if (idx + 2 < n && s.charAt(idx + 2) == '#') {
        asciiAdd = Integer.parseInt(s.substring(idx, idx + 2));
        idx += 3;
      }
      else {
        asciiAdd = Integer.parseInt(s.substring(idx, idx + 1));
        idx++;
      }
      sb.append((char) (96 + asciiAdd));
    }
    return sb.toString();
    }


    //953. Verifying an Alien Dictionary
    // 3rd solution
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> map = new HashMap<>();
      for (int i = 0; i < order.length(); i++) {
          map.put(order.charAt(i), i);
      }
      for (int i = 0; i < words.length - 1; i++) {
          if (!inOrder(words[i], words[i + 1], map)) {
              return false;
          }
      }
      return true;
  }
  
  private static boolean inOrder(String wordOne, String wordTwo, Map<Character, Integer> map) {
      for (int i = 0; i < Math.min(wordOne.length(), wordTwo.length()); i++) {
          int diff = map.get(wordOne.charAt(i)) - map.get(wordTwo.charAt(i));
          if (diff < 0) {
              return true;
          }
          if (diff > 0) {
              return false;
          }
      }
      return wordOne.length() <= wordTwo.length();
  }





    public static void main(String[] args) {
        
    }
    
}
