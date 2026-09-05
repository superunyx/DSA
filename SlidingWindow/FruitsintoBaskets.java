class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n=fruits.length;
        int low=0;
        int res=Integer.MIN_VALUE;
        for(int high=0;high<n;high++){
            map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
            while(map.size()>2){
                map.put(fruits[low],map.getOrDefault(fruits[low],0)-1);
                if(map.get(fruits[low])==0){
                    map.remove(fruits[low]);
                }
                low++;
            }
            res=Math.max(res,high-low+1);
        }
        return (res==Integer.MIN_VALUE)?0:res;
    }
}
