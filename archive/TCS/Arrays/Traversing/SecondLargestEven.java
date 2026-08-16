import java.util.*;

public class SecondLargestEven{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        boolean found=false;
        int max=Integer.MIN_VALUE;
        int max2=Integer.MIN_VALUE;
        for (int i=0;i<n;i++){
            if(arr[i]%2==0){
                if(arr[i]>=max){
                    if(max!=Integer.MIN_VALUE){
                        found=true;
                    }
                    max2=max;
                    max=arr[i];
                }
                else if(arr[i]>max2){
                    max2=arr[i];
                    found=true;
                }
            }
        }
        if(!found){
            System.out.println("-1");
        }
        else{
            System.out.println(max2);
        }
    }
}

