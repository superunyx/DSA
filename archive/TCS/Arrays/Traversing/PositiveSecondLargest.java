import java.util.*;

public class PositiveSecondLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        boolean found = false;
        for (int i =0;i<n;i++){
            if (arr[i]>0){
                if(arr[i]>max){
                    max2=max;
                    max=arr[i]; 
                }
                else if (arr[i]>max2 && arr[i]<max){
                    max2=arr[i];
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("Not Found");
        }
        else{
            System.out.println(max2);
        }
    }
}
