class Solution {
    public int count(int[][] matrix,int guess){
        int row=matrix.length-1;
        int col=0;
        int count=0;
        while(row>=0 && col<matrix[0].length){
            if(matrix[row][col]<=guess){
                count+=row+1;
                col++;
            }
            else{
                row--;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
         int low=matrix[0][0];
         int n=matrix.length;
         int m=matrix[0].length;
         int high=matrix[n-1][m-1];
         int res=-1;
         while(low<=high){
            int guess=(low+high)/2;
            int ans=count(matrix,guess);
            if(ans<k){
                low=guess+1;
            }
            else{
                res=guess;
                high=guess-1;
            }
         }
        return res;
    }
}
