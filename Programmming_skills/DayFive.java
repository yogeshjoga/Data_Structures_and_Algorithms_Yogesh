package Programmming_skills;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class DayFive {
    /*
     * Day five: functions/Methods
     * lets develop the methods to use and slove the complex problems
     * ---Methods
     */


     
     /*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
     List<Integer> result = new ArrayList<>();
     public List<Integer> preorder(Node root) {
         if(root == null) return result;
         preOderHelper(root);
         return result;
         
     }
     public void preOderHelper(Node node){
         if(node.children == null) return;
         result.add(node.val);
         for(Node child : node.children){
             preOderHelper(child);
         }
     }
    
     // 2nd solution 496 number
     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
   Stack<Integer> stack = new Stack<>();
   for (int i = nums2.length - 1; i >= 0; i--) {
     while (!stack.isEmpty() && stack.peek() <= nums2[i]) {
       stack.pop();
     }
     map.put(nums2[i], stack.isEmpty() ? -1 : stack.peek());
     stack.push(nums2[i]);
   }
   int[] result = new int[nums1.length];
   for (int i = 0; i < nums1.length; i++) {
     result[i] = map.getOrDefault(nums1[i], -1);
   }
   return result;
   }


// day five 3rd solution  1232 number
public boolean checkStraightLine(int[][] coordinates) {
    int xOne = coordinates[1][0]; 
    int yOne = coordinates[1][1];
    int dx = xOne - coordinates[0][0];
    int dy = yOne - coordinates[0][1];
    for (int[] coordinate : coordinates) {
      int x = coordinate[0];
      int y = coordinate[1];
      if (dx * (y - yOne) != dy * (x - xOne)) {
        return false;
      }
    }
    return true;
    }


     public static void main(String[] args) {
        DayFive dayFive = new DayFive();
     }
}
