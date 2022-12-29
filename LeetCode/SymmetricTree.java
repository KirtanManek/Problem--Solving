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
    public boolean isSymmetric(TreeNode root) {
        return isSymmetricTree(root.left, root.right);
    }

    public boolean isSymmetricTree(TreeNode p, TreeNode q) {
        boolean ans;
        if(p == null && q == null) ans = true;
        else if(p == null && q != null) ans = false;
        else if(p != null && q == null) ans = false;
        else {
            if(p.val == q.val && isSymmetricTree(p.left, q.right) == true && isSymmetricTree(p.right, q.left) == true) ans = true;
            else ans = false;
        }

        return ans;
    }
}
