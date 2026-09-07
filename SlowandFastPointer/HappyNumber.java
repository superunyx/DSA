class Solution {
    public int squared(int n){
        int ans=0;
        while(n!=0){
            int digit=n%10;
            ans+=digit*digit;
            n=n/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        while(fast!=1){
            slow=squared(slow);
            fast=squared(squared(fast));
            if(slow==fast && slow!=1){
                return false;
            }
        }
        return true;
    }
}
