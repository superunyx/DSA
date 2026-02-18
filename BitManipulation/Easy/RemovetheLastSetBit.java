class Solution{
    public int removelastsetbit(int n){
        return n & (n-1);        
    }
}
