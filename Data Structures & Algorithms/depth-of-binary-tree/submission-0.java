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
    public int height(TreeNode root){
        int l=0;int r=0;
        if(root==null){
            return 0;
        }
         l=1+height(root.left);
     r=1+height(root.right);
        return Math.max(l,r);
    }
    public int maxDepth(TreeNode root) {
        return height(root);
    }
}
