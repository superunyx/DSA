import java.util.*;

public class Product{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0){
            return;
        }
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=arr[0];
        int max=arr[0];
        int ans=arr[0];
        for (int i=1;i<n;i++){
            int v1=arr[i];
            int v2=arr[i]*min;
            int v3=arr[i]*max;
            max=Math.max(v1,Math.max(v2,v3));
            min=Math.min(v1,Math.min(v2,v3));
            ans=Math.max(ans,max);
        }
        System.out.print(ans);
    }
}

