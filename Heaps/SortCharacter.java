class Solution {
    class Pair{
        Character c;
        int freq;
        Pair(Character c,int freq){
            this.c=c;
            this.freq=freq;
        }
    }
    public String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq!=b.freq){
                return b.freq-a.freq;
            }
            return a.c.compareTo(b.c);
        });
        for(char c: map.keySet()){
            pq.add(new Pair(c,map.get(c)));
        }
        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Pair p = pq.poll();
            for(int i=0;i<p.freq;i++){
                sb.append(p.c);
            }
        }
        return sb.toString();
    }
}
