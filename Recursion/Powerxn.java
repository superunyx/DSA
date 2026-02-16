class Solution {
    public double power(double x,long n){
        if(n==0){
            return 1.0;
        }
        double half =power(x,n/2);
        if(n%2==0){
            return half*half;
        }
        else{
            return half*half*x;
        }
    }
    public double myPow(double x, int n) {
        long N=n;
        if(n<0){
            N=-n;
            x=1/x;
        }
        return power(x,N);
    }
}
