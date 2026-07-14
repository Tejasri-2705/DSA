class Solution {
    public List<Integer> partitionLabels(String s) {
        int l[]=new int[26];
        for(int i=0;i<s.length();i++)
        {
            l[s.charAt(i)-'a']=i;
        }
        int start=0;
        int end=0;
        List<Integer> al=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            end=Math.max(end,l[s.charAt(i)-'a']);
            if(i==end)
            {
                al.add(end-start+1);
                start=i+1;
            }

        }
        return al;
    }

}
