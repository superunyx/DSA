import java.util.*;

public class ReverseHalf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n/4;i++){
            int temp=arr[i];
            arr[i]=arr[n/2-i-1];
            arr[n/2-i-1]=temp;
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
