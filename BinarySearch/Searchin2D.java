class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int row=matrix.length;
        int col=matrix[0].length;
        int low=0;
        int high=row*col-1;//convert matrix into flat array
        while(low<=high){
            int mid=low+(high-low)/2;
            int currentrow=mid/col;//convert index back into row and col for matching
            int currentcol=mid%col;
            if(matrix[currentrow][currentcol]==target){
                return true;
            }
            else if(matrix[currentrow][currentcol]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return false;
    }
}
