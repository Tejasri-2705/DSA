class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        
        if (startFuel>=target){
            return 0;
        }
        int i=0;
        int fu=startFuel;
        int st=0;
        int n=stations.length;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        while(fu<target)
        {
            while(i<n && stations[i][0]<=fu)
            {
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty())
            {
                return -1;
            }
            fu=fu+pq.poll();
            st++;
        }
        return st;
    }
}
