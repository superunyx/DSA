import java.util.*;

public class MaxSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k = sc.nextInt();
        int low=0;
        int high=k-1;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=0;
        while(high<arr.length){
            sum+=arr[high];
            max=Math.max(max,sum);
            sum-=arr[low];
            low++;
            high++;
        }
        System.out.println(max);
    }
}
