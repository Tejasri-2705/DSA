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
    int dia;
    public int diameterOfBinaryTree(TreeNode root) {
        h(root);
        return dia;        
    }
    public int h(TreeNode root)
    {
        if(root == null)
        {
            return 0;
        }
        int left=h(root.left);
        int right=h(root.right);
        int ans=left+right;
        dia=Math.max(dia,ans);
        return 1+Math.max(left,right);
    }
}
