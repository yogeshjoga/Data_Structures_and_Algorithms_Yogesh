package DSA_1_Preparation_LeetCode_I;

import java.util.Arrays;

public class DaySix {
    /*
     * String handling 
     * string based questions slove 
     * lets start now
     */
    
    //387. First Unique Character in a String
    // 1st solution
    public int firstUniqChar(String s) {
     char[] a = s.toCharArray();
     for(int i=0; i<a.length;i++){
         if(s.indexOf(a[i])==s.lastIndexOf(a[i])){return i;}
     }
     return -1;
    }

    //383. Ransom Note
    // 2nd solution
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] dict = new int[26];
        for (char c: magazine.toCharArray()) dict[c-'a']++;
        for (char c: ransomNote.toCharArray()) {
            dict[c-'a']--;
            if (dict[c-'a'] < 0) return false;
        }
        return true;
    }

    //242. Valid Anagram
    // 3rd solution
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }


    //


     public static void main(String[] args) {
        
     }
}
