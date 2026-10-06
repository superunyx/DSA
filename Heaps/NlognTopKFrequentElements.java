class Solution {
    class Pair{
        int first;
        int second;
        Pair(int first,int second){
            this.first=first;
            this.second=second;
        }
    }
    public int[] topKFrequent(int[] nums, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if (a.second!=b.second){
                return b.second-a.second;
            }
            return a.first-b.first;
        });
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for (int x : map.keySet()){
            pq.add(new Pair(x,map.get(x)));
        }
        int[] ans= new int[k];
        for (int i=0;i<k;i++){
            ans[i]=pq.poll().first;
        }
        return ans;
    }
}
