// XOR of goal and start gives the set bits at places where bits need to be flipped 
//
// just count the set bits in the result

class Solution {
    public int minBitFlips(int start, int goal) {
        int bitcount = start^goal;
        int count =0;
        while(bitcount>0){
            bitcount=bitcount&(bitcount-1);
            count++;
        }
        return count;
    }
}
