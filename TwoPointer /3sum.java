class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> a=new ArrayList<>();
        int i=0;
        int n=nums.length;
        while(i<n-2)
        {
            int l=i+1;
            int r=n-1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                i++;
                continue;
            }
            while(l<r)
            {
                int sum=nums[i]+nums[l]+nums[r];
                if(sum==0)
                {
                    List<Integer> al=new ArrayList<>();
                    al.add(nums[i]);
                    al.add(nums[l]);
                    al.add(nums[r]);
                    a.add(al);
                    while(l<r && nums[l]==nums[l+1]) 
                   {  
                        l++;
                   }
                   while(l<r && nums[r]==nums[r-1])  
                   { 
                        r--;
                   }
                    l++;
                    r--;
                }
                   
                else if(sum>0){
                   r--;
                }
                else{
                    l++;
                }
            }
            i++;
        }
        return a;  
    }
}
