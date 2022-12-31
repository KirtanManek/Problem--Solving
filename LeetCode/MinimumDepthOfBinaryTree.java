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
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        else if(root.left == null && root.right == null) return 1;

        int countLeft = minDepth(root.left);
        int countRight = minDepth(root.right);

        if(root.left == null || root.right == null) return Math.max(countLeft, countRight) + 1;
        else return Math.min(countLeft, countRight) + 1;
    }
}
