class Solution {
    class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int distance(int x,int y){
        return x*x+y*y;
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.second!=b.second){
                return b.second-a.second;
            }
            return a.first-b.first;
        });
        for (int i=0;i<points.length;i++){
            int distance=distance(points[i][0],points[i][1]);
            pq.add(new Pair(i,distance));
            if(pq.size()>k){
                pq.poll();
            }
        }
        int[][] ans = new int[k][2];
        for(int i=0;i<k;i++){
            int index=pq.poll().first;
            ans[i][0]=points[index][0];
            ans[i][1]=points[index][1];
        }
        return ans;
    }
}
