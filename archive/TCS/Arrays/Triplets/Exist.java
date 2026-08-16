import java.util.*;

public class Exist{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int target = sc.nextInt();
        for(int i=0;i<n-2;i++){
            int left=i+1;
            int right=n-1;
            int sum2=target-arr[i];
            while(left<right){
                if(arr[left]+arr[right]==sum2){
                    System.out.print(arr[i]+" "+arr[left]+" "+arr[right]);
                    return;
                }
                else if(arr[left]+arr[right]>sum2){
                    right--;
                }
                else{
                    left++;
                }
            }
        }
        System.out.print("-1");        
    }
}
