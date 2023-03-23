package DSA_1_Preparation_LeetCode_I;

import java.util.LinkedList;
import java.util.Queue;

public class Day13 {
/*
 * day -13 
 * Day 13 Tree
 * Binary search tree
 * let's start Binary serach tree problems solve
 */


 //700. Search in a Binary Search Tree
 // 1st solution

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
    public TreeNode searchBST(TreeNode root, int val) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode removed = queue.remove();
            if (removed.val == val) {
                return removed;
            }
            if (removed.val > val && removed.left != null) {
                queue.add(removed.left);
            } 
            if (removed.val < val && removed.right != null) {
                queue.add(removed.right);
            }
        }
        return null;
    }
//}

//701. Insert into a Binary Search Tree
// 2nd solution --> Binary  serach tree insertion Medium type probem
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null)
      return new TreeNode(val);
    if (root.val > val)
      root.left = insertIntoBST(root.left, val);
    else
      root.right = insertIntoBST(root.right, val);
    return root;
    }
//}

    public static void main(String[] args) {
        
    }
    
}
