class Solution {
    public int characterReplacement(String s, int k) {
        int a[]=new int[26];
        int i=0;
        int len=0;
        int mf=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int j=0;j<s.length();j++)
        {
            hm.put(s.charAt(j),hm.getOrDefault(s.charAt(j),0)+1);
            mf=Math.max(mf,hm.get(s.charAt(j)));
            while((j-i+1)- mf >k)
            {
                 hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)-1);
                 i++;                
            }
            len=Math.max(len,j-i+1);
        }
        return len;
    }
}
