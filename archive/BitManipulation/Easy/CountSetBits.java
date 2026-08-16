// iterative 
//
// User function Template for Java
class Solution {
    static int setBits(int n) {
        int x = 1;
        int count =0;
        while(x<=n){
            if((n&x)!=0){
                count++;
            }
            x=x<<1;
        }
        return count;
    }
}

// brian algo 
//
// removing rightmost set bit untill 0 and count 

// User function Template for Java
class Solution {
    static int setBits(int n) {
        int count = 0;
        while(n>0){
            n=n&(n-1);
            count++;
        }
        return count;
    }
}
