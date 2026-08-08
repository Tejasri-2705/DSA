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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        StringBuffer sb = new StringBuffer();

        sums(root, res, sb);

        return res;
    }

    public void sums(TreeNode root, List<String> res, StringBuffer sb) {

        if (root == null) {
            return;
        }

        // Save the current state before modifying the path
        int oldLength = sb.length();

        // Add current node
        if (sb.length() > 0) {
            sb.append("->");
        }
        sb.append(root.val);

        // If leaf, store the path
        if (root.left == null && root.right == null) {
            res.add(sb.toString());
        } else {
            // Explore both sides
            sums(root.left, res, sb);
            sums(root.right, res, sb);
        }

        // Backtrack to the state before this node
        sb.setLength(oldLength);
    }
}
