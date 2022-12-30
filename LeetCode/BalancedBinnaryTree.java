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
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) return true;
        return depth(root) != -1;
    }

    public int depth(TreeNode root) {
        if(root == null) return 0;

        int countLeft = depth(root.left);
        if(countLeft == -1) return -1;

        int countRight = depth(root.right);
        if(countRight == -1) return -1;

        if(countLeft - countRight < -1 || countLeft - countRight > 1) return -1;

        return Math.max(countLeft, countRight) + 1;
    }
}
