import java.util.*;

public class SecondDistinctLargest{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n<2){
            System.out.println("No Second Largest");
            return;
        }
        int max = arr[0];
        int max2 = Integer.MIN_VALUE;
        boolean found = false;
        for (int i=1;i<n;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
                found = true;
            }
            else if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
                found = true;
            }
        }
        if(!found){
            System.out.println("No Second Largest");
        }
        else{
            System.out.println(max2);
        }

    }
}
