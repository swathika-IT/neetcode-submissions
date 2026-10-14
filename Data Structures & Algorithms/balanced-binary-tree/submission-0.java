class Solution {
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        if(Math.abs(height(root.left)-height(root.right))<=1){
            if(isBalanced(root.left)&&isBalanced(root.right))
            return true;
        }
        return false;
    }
}