// iterative approach O(N)
//
//
class Solution{
    public int xorinagivenrange(int n){
        int ans = 0;
        for (int i=1;i<=n;i++){
            ans=ans^i;
        }
        return ans;
    }
}

///
///
///
///bit approach 
///
///xor 1 =        1
///xor 2 = 1^2  = 2
///xor 3 = 1^2^3 = 0
///xor 4 = 4
///
///xor 5  = 1
///xor 6 = 7
///xor 7 = 0
///xor 8 = 8
///
///xor (4n+1) = 1;
///xor (4n+2) = n+1;
///xor (4n+3) = 0;
///xor (4n) = n 
///
///O(1)
///


class Solution{
    public int xor(int n){
        if (n%4==0){
            return n;
        }
        else if((n-1)%4==0){
            return 1;
        }
        else if((n-2)%4==0){
            return n+1;
        }
        else{
            return 0;
        }
    }
}
