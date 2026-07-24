class Solution {
    public int findMaxLength(int[] nums) {
        int n=nums.length;
        int len=0;
        int sum=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0,-1);
        for(int i=0;i<n;i++)
        {
          if(nums[i]==0)
          {
            sum--;
          }
          else{
            sum++;
          }
          if(hm.containsKey(sum))
          {
            len=Math.max(len,i-hm.get(sum));
          }
          else{
            hm.put(sum,i);
          }
        }
        return len;
    }
}
