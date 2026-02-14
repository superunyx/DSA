class Solution{
    public int reducetozero(int x){
        int count =0;
        while(x!=0){
            int reducer = 1;
            for (int i=2;i*i<=x;i++){
                if(x%i==0){
                    reducer = x/i;
                    break;
                }
            }
            x=x-reducer;   
            count++;
        }
        return count;
    }
}
