package DSA_1_Preparation_LeetCode_I;

public class DayEleven {


    /*
     * Advance tree
     * algo's and datastructers
     * 
     */


     //102. Binary Tree Level Order Traversal
    // medimum type solution 1st


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
    public List<List<Integer>> levelOrder(TreeNode root) {
              Queue<TreeNode> queue = new LinkedList<TreeNode>();
        List<List<Integer>> wrapList = new LinkedList<List<Integer>>();

        if(root == null) return wrapList;

        queue.offer(root);
        while(!queue.isEmpty()){
            int levelNum = queue.size();
            List<Integer> subList = new LinkedList<Integer>();
            for(int i=0; i<levelNum; i++) {
                if(queue.peek().left != null) queue.offer(queue.peek().left);
                if(queue.peek().right != null) queue.offer(queue.peek().right);
                subList.add(queue.poll().val);
            }
            wrapList.add(subList);
        }
        return wrapList;
    }
//}



//104. Maximum Depth of Binary Tree
//2nd solution

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



//101. Symmetric Tree
//3rd solution
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
    public boolean isSymmetric(TreeNode root) {
        if (root==null)  return true;

        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode left, right;
        if (root.left != null) {
            if (root.right == null) return false;
            stack.push(root.left);
            stack.push(root.right);
        } else if (root.right != null) {
            return false;
        }

        while (!stack.empty()) {
            if (stack.size()%2 != 0)   return false;
            right = stack.pop();
            left = stack.pop();
            if(right.val != left.val) return false;

            if (left.left != null) {
                if(right.right == null)   return false;
                stack.push(left.left);
                stack.push(right.right);
            } else if(right.right != null){
                return false;
            }

            if (left.right != null) {
                if(right.left == null)   return false;
                stack.push(left.right);
                stack.push(right.left);
            } else if(right.left != null) {
                return false;
            }
        }

        return true;
    }
//}







    public static void main(String[] args) {
        
    }
    
}
