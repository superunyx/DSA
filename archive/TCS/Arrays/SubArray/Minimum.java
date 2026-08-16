import java.util.*;

public class Minimum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if (n==0){
            return;
        }
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int sum=arr[0];
        int ans=arr[0];
        for (int i=1;i<n;i++){
            int v1=sum+arr[i];
            int v2=arr[i];
            sum=Math.min(v1,v2);
            ans=Math.min(sum,ans);
        }
        System.out.print(ans);
    }
}

