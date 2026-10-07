class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int i=0;i<heights.length-1;i++){
            int diff=heights[i+1]-heights[i];
            if(diff<=0){
                continue;
            }
            bricks-=diff;
            pq.add(diff);
            if(bricks<0){
                if(ladders==0){
                    return i;
                }
                ladders--;
                bricks+=pq.poll();
            }
        }
        return heights.length-1;
    }
}
