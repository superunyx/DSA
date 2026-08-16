class Solution {
    static final long MOD = 1000000007;
    public long power(long base,long exp){
        if(exp==0){
            return 1;
        }
        long half=power(base,exp/2);
        long result=(half*half) % MOD;
        if(exp%2==1){
            return result*base % MOD;
        }
        return result;
    }
    public int countGoodNumbers(long n) {
        long oddcount=n/2;
        long evencount=(n+1)/2;
        long oddways = power(4,oddcount);
        long evenways = power(5,evencount);
        return (int)((oddways*evenways)%MOD);
    }
}
