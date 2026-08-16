import java.util.*;

public class TwoSum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        // Do Arrays.sort(arr) is the given array is not sorted that will increase the complexity to nlogn
        int a=0,b=n-1;
        while(a<b){
            if(arr[a]+arr[b]==target){
                System.out.println("True");//given i have to just find if two integers exist that have the target sum or not if the numbers would have been asked i would return arr[a] and arr[b] if the index would have been asked i would print a and b.
                return;
            }
            else if(arr[a]+arr[b]<target){
                a++;
            }
            else{
                b--;
            }
        }
        System.out.println("False");
    }
}
