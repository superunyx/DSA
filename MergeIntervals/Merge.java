class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        // or Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n=intervals.length;
        int[][] ans=new int[intervals.length][2];
        int start1=intervals[0][0];
        int end1=intervals[0][1];
        int index=0;
        for(int i=1;i<intervals.length;i++){
            int start2=intervals[i][0];
            int end2=intervals[i][1];
            if(end1>=start2){
                end1=Math.max(end1,end2);
                continue;
            }
            else{
                ans[index][0]=start1;
                ans[index][1]=end1;
                start1=start2;
                end1=end2;
                index++;
            }
        }
        ans[index][0]=start1;
        ans[index][1]=end1;
        return Arrays.copyOf(ans, index + 1);
    }
}
