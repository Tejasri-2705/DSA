class Solution {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int p:nums)
        {
            if(hm.get(p)==1 && !hm.containsKey(p-1) && !hm.containsKey(p+1))
            {
                al.add(p);
            }
        }
        return al;
        
    }
}
