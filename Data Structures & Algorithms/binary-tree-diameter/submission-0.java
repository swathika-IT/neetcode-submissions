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
    int maxx=0;
       
    public int height(TreeNode root){
        int l=0;int r=0;
         if(root==null){
            return 0;
        }
        l=height(root.left);
        r=height(root.right);
     maxx=maxx>l+r?maxx:l+r;
     return Math.max(l,r)+1;
    }
    public int diameterOfBinaryTree(TreeNode root) {
         height(root);
         return maxx;
    }
}
