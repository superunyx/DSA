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
        int max=sum;
        while(high<arr.length-1){
            high++;
            sum+=arr[high];
            
            sum-=arr[low];
            low++;
            max=Math.max(max,sum);
        }
        System.out.println(max);
    }
}

// simpler
//
//
//
int sum = 0;

for (int i = 0; i < k; i++) {
    sum += arr[i];
}

int max = sum;

for (int i = k; i < n; i++) {
    sum += arr[i];
    sum -= arr[i - k];
    max = Math.max(max, sum);
}

System.out.println(max);
