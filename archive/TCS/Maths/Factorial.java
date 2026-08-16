factorial(int n){
    if(n==1 || n==0){
        return 1;
    }
    return n*factorial(n-1);
}
//this is O(N) both time and space 
//or


//this is O(N) time but constant space; optimal
factorial(int n){
    int fact =1;
    for (int i=2;i<=n;i++){
        fact*=i;
    }
    return fact;
}
