class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null)
        {
            return 0;
        }
        int left = maxDepth(root.left);
        int ri=maxDepth(root.right);
        return 1+Math.max(left,ri);
    }
}
