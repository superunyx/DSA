// iterative for loop 
//
//  O(R-L+1)


// bit wise 
//
//
// xor (l,r) = xor(1,l-1) ^ xor (1,r)
//
//
// xor ( 4,5 ,6, 7) = xor (1,2,3) ^ xor (1,2,3,4,5,6,7)
//
// pairs cancel out 
//


class Solution{
    public int xorfromltor(int l,int r){
        int ans = 0;
        int xor1 = 0;
        int xor2 = 0;
        int end1 = l-1;
        if(end1%4==0){
            xor1=end1;
        }
        else if((end1-1)%4==0){
            xor1=1;
        }
        else if ((end1-2)%4==0){
            xor1=end1+1;
        }
        else{
            xor1=0; 
        }
        if(r%4==0){
            xor2=r;
        }
        else if((r-1)%4==0){
            xor2=1;
        }
        else if((r-2)%4==0){
            xor2=r+1;
        }
        else{
            xor2=0;
        }
        ans = xor1 ^ xor2;
        return ans;
    }
}
