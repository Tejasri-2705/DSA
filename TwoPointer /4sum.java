class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> al=new ArrayList<>();
        Arrays.sort(nums);
        int n=nums.length;
        int i=0;
        while(i<n-3)
        {
            int j=i+1;
            while(j<n-2)
            {
                
                int l= j+1;
                int r= n-1;
                while(l<r)
                {
                    long sum = (long) nums[l]+nums[r]+nums[j]+nums[i];
                    if(sum==target)
                    {
                        ArrayList<Integer> a=new ArrayList<>();
                        a.add(nums[l]);
                        a.add(nums[r]);
                        a.add(nums[j]);
                        a.add(nums[i]);
                        if(!al.contains(a))
                            al.add(a);
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
                    else if(sum>target){
                            r--;
                        }
                    else{
                        l++;
                    }
                }
                while (j < n - 2 && nums[j] == nums[j + 1])
                     j++;
                j++;
                
            }
            while (i < n - 3 && nums[i] == nums[i + 1])
                     i++;
            i++;
        }
        return al;
        
    }
}
