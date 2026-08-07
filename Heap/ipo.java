class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) 
    {
        int n=profits.length;
        int pro[][]=new int[n][2];
        for(int i=0;i<n;i++)
        {
            pro[i][0]=capital[i];
            pro[i][1]=profits[i];
        }
        Arrays.sort(pro,(a,b)->a[0]-b[0]);
        PriorityQueue<Integer> heap= new PriorityQueue<>((a,b)->b-a);
        int in=0;
        for(int i=0;i<k;i++)
        {
            while(in<n && pro[in][0]<=w)
            {
               
                heap.add(pro[in][1]);
                 in++;
            }
            if(heap.isEmpty())
            {
                break;
            }
            w=w+heap.poll();
        }
        return w;
        
    }
}
