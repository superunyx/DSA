// find square root of a number using binary search
//



public int squareroot(int n){
    int low=0;
    int high=n;
    int ans=-1;
    if(n==1 || n==0){
        return n;
    }
    while(low<=high){
        int mid=(low+high)/2;
        if(mid*mid==n){
            return mid;
        }
        else if (mid*mid<n){
            ans=mid;
            low=mid+1;
        }
        else{
            high=mid-1;
        }

    }
    return ans;
}
