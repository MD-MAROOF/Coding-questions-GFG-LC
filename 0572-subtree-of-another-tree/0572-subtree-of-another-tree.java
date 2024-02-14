class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null) 
            return true;
        if(root == null || subRoot == null)
            return false;
        
        return checkEqual(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
    
    private boolean checkEqual(TreeNode root, TreeNode subRoot) {
        if(root == null && subRoot == null)
            return true;
        if(root == null || subRoot == null) 
            return false;
        
        return root.val == subRoot.val && checkEqual(root.left, subRoot.left) && checkEqual(root.right, subRoot.right);
    }
}