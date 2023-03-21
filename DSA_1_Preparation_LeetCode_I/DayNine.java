package DSA_1_Preparation_LeetCode_I;

import java.util.Stack;

public class DayNine {
    /*
     * Day 9 Stack / Queue
     */


     //20. Valid Parentheses
     // 1st solution
      public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
      	for (char c : s.toCharArray()) {
        		if (c == '(')
        			  stack.push(')');
        		else if (c == '{')
        			  stack.push('}');
        		else if (c == '[')
        			  stack.push(']');
        		else if (stack.isEmpty() || stack.pop() != c)
        			  return false;
      	}
      	return stack.isEmpty();
    }


    // implementation

/*
class MyQueue {

    public MyQueue() {
        
    }
    
    public void push(int x) {
        
    }
    
    public int pop() {
        
    }
    
    public int peek() {
        
    }
    
    public boolean empty() {
        
    }
}

 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */


 // m
     public static void main(String[] args) {
        
     }
    
}
