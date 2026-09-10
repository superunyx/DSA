class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        Arrays.sort(start);
        Arrays.sort(end);
        int cnt=0;
        int j=0;
        int i=0;
        int res=0;
        while(i<start.length){
            if(start[i]<end[j]){
                cnt++;
                res=Math.max(res,cnt);
                i++;
            }
            else{
                cnt--;
                j++;
            }
        }
        return res;
    }
}
