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
    List<Integer> postorder = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        traversePostorder(root);
        return postorder;
    }

    public void traversePostorder(TreeNode root) {
        if(root == null) return;
        
        traversePostorder(root.left);
        traversePostorder(root.right);
        postorder.add(root.val);
    }
}
