class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> al=new ArrayList<>();
        String s="123456789";
        int n=s.length();
        int minl=String.valueOf(low).length();
        int maxl=String.valueOf(high).length();
        for(int i=minl;i<=maxl;i++)
        {
            for(int k=0;k<=n-i;k++)
            {
                int va=Integer.parseInt(s.substring(k,k+i));
                 if(va>=low && va<=high)
                   {
                    if(!al.contains(va))
                        al.add(va);
                   }
            }

         } 
        return al;
    }
}
