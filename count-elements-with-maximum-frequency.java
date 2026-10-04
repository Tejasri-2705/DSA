class Solution {
    public int maxFrequencyElements(int[] nums) {
        int mf=0;
        int c=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
            if(hm.get(i)>mf)
            {
                mf=hm.get(i);
            }
        }
        for(int p:nums)
        {
            if(hm.get(p)==mf)
            {
                c++;
            }
        }
        return c;

    }
}
