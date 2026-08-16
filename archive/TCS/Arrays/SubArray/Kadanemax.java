import java.util.*;

public class Kadanemax{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        if(n==0){
            return;
        }
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int ans=arr[0];
        int maxsum=arr[0];
        for(int i=1;i<n;i++){
            int v1=maxsum+arr[i];
            int v2=arr[i];
            maxsum=Math.max(v1,v2);
            ans=Math.max(ans,maxsum);
        }
        System.out.print(ans);
    }
}

// 
//

int ans=Integer.MIN_VALUE;
int sum=0;
for (int i=0;i<n;i++){
    sum+=arr[i];
    ans=Math.max(sum,ans);
    if(sum<0){
        sum=0;
    }
}
