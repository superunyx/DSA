import java.util.*;

public class Secondlargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<2){
            System.out.println("Not Possible");
            return;
        }
        int max=arr[0];
        int max2=Integer.MIN_VALUE;
        for (int i=1;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }
            else if (arr[i]>max2){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
}
        

