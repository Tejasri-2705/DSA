class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char c:s.toCharArray())
        {
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));
        pq.addAll(hm.keySet());
        StringBuffer sb=new StringBuffer();
        while(!pq.isEmpty())
        {
            char c=pq.poll();
            int n=hm.get(c);
            for(int i=0;i<n;i++)
            {
                sb.append(c);
            }
        }
        return sb.toString();

    }
}
