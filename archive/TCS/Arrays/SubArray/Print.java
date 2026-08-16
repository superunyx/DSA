import java.util.*;

public class Print{
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
        int max=arr[0];
        int ans=arr[0];
        int start=0;
        int end=0;
        int tempStart=0;
        for (int i=1;i<n;i++){
            int v1=arr[i];
            int v2=max+arr[i];
            if(v1>v2){
                max=v1;
                tempStart=i;
            }
            else{
                max=v2;
            }
            if(max>ans){
                ans=max;
                start=tempStart;
                end=i;
            }
        }
        for(int i=start;i<=end;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
