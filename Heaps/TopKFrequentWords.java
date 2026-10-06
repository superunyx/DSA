class Solution {
    class Pair{
        int first;
        String second;
        Pair(String second,int first){
            this.first=first;
            this.second=second;
        }
    }
    public List<String> topKFrequent(String[] words, int k) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.first!=b.first){
                return a.first-b.first;
            }
            return b.second.compareTo(a.second);
        });
        HashMap<String,Integer> map = new HashMap<>();
        for (String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        for(String s:map.keySet()){
            pq.add(new Pair(s,map.get(s)));
            if(pq.size()>k){
                pq.poll();
            }
        }
        List<String> ans = new ArrayList<>();
        while (!pq.isEmpty()) {
            ans.add(pq.poll().second);  
        }
        Collections.reverse(ans);
        return ans;
    }
}
