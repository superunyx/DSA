class Solution {
    public String frequencySort(String s) {
        StringBuilder result = new StringBuilder();
        Map<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Character>[] bucket = new ArrayList[s.length()+1];
        for (char c : map.keySet()){
            int f = map.get(c);
            if(bucket[f]==null){
                bucket[f] = new ArrayList<>();
            }
            bucket[f].add(c);
        }
        for (int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for (char c: bucket[i]){
                    for (int k=0;k<i;k++){
                        result.append(c);
                    }
                }
            }
        }
        return result.toString();
        
    }
}
