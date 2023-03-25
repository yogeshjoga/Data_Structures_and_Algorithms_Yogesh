package Programmming_skills_LeetCode;

import java.util.Arrays;
import java.util.Stack;

public class Day11 {
    /*
     * Day 11 
     * Containers & Libraries
     * 
     * Algo's
     * Array Bit manipulation sorting
     * stack design queue
     * hashtable string 
     */
    

     //1356. Sort Integers by The Number of 1 Bits
     // 1st solution
     public int[] sortByBits(int[] arr) {
        Integer[] A = Arrays.stream(arr).boxed().toArray(Integer[] ::new);
        Arrays.sort(A,
                    (a, b)
                        -> Integer.bitCount(a) == Integer.bitCount(b)
                               ? a - b
                               : Integer.bitCount(a) - Integer.bitCount(b));
        return Arrays.stream(A).mapToInt(Integer::intValue).toArray();
        }


    //232. Implement Queue using Stacks
    // 2nd solution
    // public class MyQueue   ---constructor
    private Stack<Integer> stack;
    public MyQueue() {  //--constructor
        this.stack = new Stack<Integer>();
    }
    
    public void push(int x) {
        Stack<Integer> temp = new Stack<Integer>();
        int preSize = this.stack.size();
        for(int i=0; i<preSize; i++){
            temp.push(this.stack.pop());
        }
        this.stack.push(x);
        for(int i=0; i<preSize; i++){
            this.stack.push(temp.pop());
        }
        
    }
    
    public int pop() {
        return this.stack.pop();
    }
    
    public int peek() {
        return this.stack.peek();
    }
    
    public boolean empty() {
        return this.stack.isEmpty();
    }


    // 242. Valid Anagram
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

    //217. Contains Duplicate
    // 3rd solution
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0; i<nums.length-1; ++i){
            if(nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }


     public static void main(String[] args) {
        
     }
}
