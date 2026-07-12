class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l=new ArrayList<>();
        int i=0;
        int j=i+1;
        int n=nums.length;
        while(i<n && j<n)
        {
            if(nums[i]==nums[j])
            {
                l.add(nums[i]);
                i++;
                j++;
            }
            i++;
            j++;

        }
        return l;
    }
}
