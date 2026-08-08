class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
         
         List<List<Integer>> res= new ArrayList<>();
         List<Integer> path=new ArrayList<>();
         sums(root,targetSum,res,path);
         return res;         
    }
    public void sums(TreeNode root,int target,List<List<Integer>> res,List<Integer> path)
    {
        if(root==null)
        {
            return;
        }
        int rem=target-root.val;
        path.add(root.val);
        if(rem==0)
        {
            if(root.left==null && root.right==null)
            {
                res.add(path);
            }
        }
        sums(root.left,rem,res,path);
        sums(root.right,rem,res,path);
        path.remove(path.size()-1);        
    }
}
