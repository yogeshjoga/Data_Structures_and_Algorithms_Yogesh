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


 // main solution
// 232 Implement Queue using Stacks

 class MyQueue {
        private Stack<Integer> st;
        
        /** Initialize your data structure here. */
        public MyQueue() {
            this.st = new Stack<Integer>();
        }
        
        /** Push element x to the back of queue. */
        public void push(int x) {
            Stack<Integer> temp = new Stack<>();
            int preSize = this.st.size();
            for (int i=0; i<preSize; i++) {
                temp.push(this.st.pop());
            }
            this.st.push(x);
            for (int i=0; i<preSize; i++) {
                this.st.push(temp.pop());
            }
        }
        
        /** Removes the element from in front of queue and returns that element. */
        public int pop() {
            return this.st.pop();
        }
        
        /** Get the front element. */
        public int peek() {
            return this.st.peek();
        }
        
        /** Returns whether the queue is empty. */
        public boolean empty() {
            return this.st.isEmpty();
        }
    }

     public static void main(String[] args) {
        
     }
    
}
