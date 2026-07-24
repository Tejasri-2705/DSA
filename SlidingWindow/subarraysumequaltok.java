class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int c=0;
        int r=0;
        int sum=0;
        hm.put(0,1);
        while(r<nums.length)
        {
            sum=sum+nums[r];
            if(hm.containsKey(sum-k))
            {
                 c += hm.get(sum - k);
            }
            hm.put(sum,hm.getOrDefault(sum,0)+1);
           
            r++;
        }
        return c;
    }
}
