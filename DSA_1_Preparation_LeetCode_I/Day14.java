package DSA_1_Preparation_LeetCode_I;



public class Day14 {
    /*
     * Day14
     * tree, depth-first search
     * two pointers
     * Hashtable 
     * these are the algos
     * 
     */
    
    // 98. Validate Binary Search Tree
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
    public boolean isValidBST(TreeNode root) {
        return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean helper(TreeNode root, long min, long max) {
        if (root == null) return true;
        if (root.val <= min || root.val >= max) return false;
        return helper(root.left, min, root.val) && helper(root.right, root.val, max);
    }
    
//}

//653. Two Sum IV - Input is a BST
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
    public boolean findTarget(TreeNode root, int k) {
        if (root == null) {
      return false;
    }
    Stack<TreeNode> stack = new Stack<>();
    Set<Integer> set = new HashSet<>();
    while (root != null) {
      if (set.contains(k - root.val)) {
        return true;
      }
      stack.push(root);
      set.add(root.val);
      root = root.left;
    }
    while (!stack.isEmpty()) {
      TreeNode removed = stack.pop();
      TreeNode rightNode = removed.right;
      while (rightNode != null) {
        if (set.contains(k - rightNode.val)) {
          return true;
        }
        stack.push(rightNode);
        set.add(rightNode.val);
        rightNode = rightNode.left;
      }
    }
    return false;
    }
//}


//235. Lowest Common Ancestor of a Binary Search Tree
// 3rd sum

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 //class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
     if (root == null) {
      return root;
    }
    if (root == p || root == q) {
      return root;
    }
    if ((root.val > p.val && root.val < q.val) || (root.val < p.val && root.val > q.val)) {
      return root;
    }
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    return left == null ? lowestCommonAncestor(root.right, p, q) : left;
    }
//}




     public static void main(String[] args) {
        
     }
}
