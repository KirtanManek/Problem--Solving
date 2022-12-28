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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean ans;
        if(p == null && q == null) ans = true;
        else if(p == null && q != null) ans = false;
        else if(p != null && q == null) ans = false;
        else {
            if(p.val == q.val && isSameTree(p.left, q.left) == true && isSameTree(p.right, q.right) == true) ans = true;
            else ans = false;
        }

        return ans;
    }
}
