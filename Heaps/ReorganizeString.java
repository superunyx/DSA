class Solution {
    class Pair{
        int freq;
        char c;
        Pair(char c,int freq){
            this.freq=freq;
            this.c=c;
        }
    }
    public String reorganizeString(String s) {
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> {
            if(a.freq!=b.freq){
                return b.freq-a.freq;
            }
            return b.c-a.c;
        });
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (char c: map.keySet()){
            pq.add(new Pair(c,map.get(c)));
        }
        StringBuilder sb = new StringBuilder();
        int seat=0;
        while(!pq.isEmpty()){
            Pair p=pq.poll();
            if(seat==0 || sb.charAt(seat-1)!=p.c){
                sb.append(p.c);
                seat++;
                p.freq--;
                if(p.freq>0){
                    pq.add(p);
                }
            }
            else{
                if(pq.isEmpty()){
                    return "";
                }
                Pair p2=pq.poll();
                sb.append(p2.c);
                seat++;
                p2.freq--;
                if(p2.freq>0){
                    pq.add(p2);
                }
                pq.add(p);
            }
        }
        return sb.toString();
    }
}
