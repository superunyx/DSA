class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }

        while(true){
            int x=Integer.MAX_VALUE;
            int y=Integer.MAX_VALUE;

            if(!pq.isEmpty()){
                x=pq.poll();
            }

            if(!pq.isEmpty()){
                y=pq.poll();
            }
            else{
                if(x!=Integer.MAX_VALUE){
                    return x;
                }
                else{
                    return 0;
                }
            }

            if(x==y){
                continue;
            }
            else{
                pq.add(x-y);
            }
        }
    }
}
