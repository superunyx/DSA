import java.util.*;

public class Count{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        int count=0;
        for(int i=0;i<n-2;i++){
            if(i>0 && arr[i]==arr[i-1]){
                continue;
            }
            int left=i+1;
            int right=n-1;
            int sum2=target-arr[i];
            while(left<right){
                if(arr[left]+arr[right]==sum2){
                    count++;
                    left++;
                    right--;
                    while(left<right && arr[left]==arr[left-1]){
                        left++;
                    }
                    while(right>left && arr[right]==arr[right+1]){
                        right--;
                    }
                }
                else if(arr[left]+arr[right]>sum2){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        System.out.print(count);        
    }
}
