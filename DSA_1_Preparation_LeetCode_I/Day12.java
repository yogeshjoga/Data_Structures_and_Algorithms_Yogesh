package DSA_1_Preparation_LeetCode_I;



public class Day12 {

/*
 * Advance tree problems
 * Depth first search Algo
 */

 //226. Invert Binary Tree --> its mean mirror the binary tree
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
    public TreeNode invertTree(TreeNode root) {
         if (root == null || (root.left == null && root.right == null)) {
            return root;
        }
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        root.left = left;
        root.right = right;
        return root;
    }
//}


// 112. Path Sum
// 2nd solution

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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sum(root, targetSum, 0);
    }

    private boolean sum(TreeNode root, int sum, int sumForNow) {
        if (root == null) {
            return false;
        }

        sumForNow += root.val;

        if (sumForNow == sum && root.left == null && root.right == null) {
            return true;
        }

        if (sum(root.left, sum, sumForNow)) {
            return true;
        }

        return sum(root.right, sum, sumForNow);
    }
    
//}




    public static void main(String[] args) {
        
    }
    
}
