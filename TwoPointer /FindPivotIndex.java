class Solution {
    public int pivotIndex(int[] nums) {
       
        int pref[]=new int[nums.length];
        pref[0]=nums[0];
        int n=nums.length;
        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+nums[i];
        }
        if(pref[0]==pref[nums.length-1])
        {
            return 0;
        }
        for(int i=1;i<nums.length;i++)
        {
            int left = pref[i-1];
            int right= pref[nums.length-1]-pref[i];
            if(left==right)
            {
                return i;
            }
        }
        return -1;
    }


}
