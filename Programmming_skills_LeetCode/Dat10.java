package Programmming_skills_LeetCode;

public class Dat10 {
/*
 * Let's see solve the problems
 * LinkedList, Math, Two Pointers, Tree Depth-First Search 
 * Algo's are used into these problems
 */


//1290. Convert Binary Number in a Linked List to Integer
// 1st solution
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
    public int getDecimalValue(ListNode head) {
        int ans = 0;

    for (; head != null; head = head.next)
      ans = ans * 2 + head.val;

    return ans;
    }
//}


// 876. Middle of the Linked List
// 2nd solution

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
    public ListNode middleNode(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
      slow = slow.next;
      fast = fast.next.next;
    }
    return slow;
    }
//}

//104. Maximum Depth of Binary Tree
// 3rd solution
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
    public int maxDepth(TreeNode root) {
     
       if (root == null){
           return 0;
       }
       int left = maxDepth(root.left);
       int right = maxDepth(root.right);
       return Math.max(left, right) + 1;
   }
    
//}


//404. Sum of Left Leaves
// 4th solution
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
//class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
         if (root == null)
      return 0;

    int ans = 0;

    if (root.left != null) {
      if (root.left.left == null && root.left.right == null)
        ans += root.left.val;
      else
        ans += sumOfLeftLeaves(root.left);
    }
    ans += sumOfLeftLeaves(root.right);

    return ans;
    }
//}







    public static void main(String[] args) {
        
    }
    
}
