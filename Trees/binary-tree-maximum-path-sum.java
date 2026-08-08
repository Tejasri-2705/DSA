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
    int ans = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        maxi(root);
        return ans;
        
    }
    public int maxi(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        
        int l=maxi(root.left);
         int r=maxi(root.right);
            l= Math.max(0, l);
            r = Math.max(0, r);
        int  cur=root.val+l+r;
        ans=Math.max(ans,cur);
        return root.val+Math.max(l,r);        
    }
}
