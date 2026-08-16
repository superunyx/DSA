class CheckBit {
    static boolean checkKthBit(int n, int k) {
        if((n&(1<<k))==1<<k){
            return true;
        }
        return false;
    }
}


// can also do 
//
//



class CheckBit{
    static boolean checkKthBit(int n, int k){
        if(((n>>k)&1)==1){
            return true;
        }
        return false;
    }
}
