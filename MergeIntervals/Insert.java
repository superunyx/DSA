class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] ans = new int[n+1][2];
        int index=0;
        boolean insert=false;
        for(int i=0;i<n;i++){
            int start=intervals[i][0];
            if(insert==false && start>=newInterval[0]){
                ans[index][0]=newInterval[0];
                ans[index][1]=newInterval[1];
                index++;
                insert=true;
            }
            ans[index][0]=start;
            ans[index][1]=intervals[i][1];
            index++;
        }
        if (!insert) {
        ans[index][0] = newInterval[0];
        ans[index][1] = newInterval[1];
        index++;
        }
        int[][] res = new int[n+1][2];
        int start1=ans[0][0];
        int end1=ans[0][1];
        index=0;
        for(int i=1;i<ans.length;i++){
            int start2=ans[i][0];
            int end2=ans[i][1];
            if(end1>=start2){
                end1=Math.max(end1,end2);
                continue;
            }
            else{
                res[index][0]=start1;
                res[index][1]=end1;
                start1=start2;
                end1=end2;
                index++;
            }
        }
        res[index][0]=start1;
        res[index][1]=end1;
        return Arrays.copyOf(res, index + 1);
    }
}

//using list 
//
    class Solution {
        public int[][] insert(int[][] intervals, int[] newInterval) {
            List<int[]> result = new ArrayList<>();
            int i = 0;
            int n = intervals.length;
  
            // 1. Add all intervals ending before newInterval starts
            while (i < n && intervals[i][1] < newInterval[0]) {
                result.add(intervals[i]);
                i++;
            }
  
            // 2. Merge all overlapping intervals into newInterval
            while (i < n && intervals[i][0] <= newInterval[1]) {
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }
            result.add(newInterval);
  
            // 3. Add the rest of the intervals
            while (i < n) {
                result.add(intervals[i]);
                i++;
            }
  
            return result.toArray(new int[result.size()][]);
        }
    }
  
