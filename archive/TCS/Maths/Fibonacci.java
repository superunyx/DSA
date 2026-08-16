fib(int n){
    if (n==1||n==0){
        return n;
    }
    return fib(n-1)+fib(n-2);
}
//recursive 
//
//or 
//
//
//optimal
//


fib(int n){
    if(n==1){
        return 1;
    }
    if(n==0){
        return 0;
    }
    int a =0;
    int b=1;
    for (int i=2;i<=n;i++){
        c=a+b;
        a=b;
        b=c;
    }
    return b;
}
