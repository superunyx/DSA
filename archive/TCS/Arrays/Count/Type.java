import java.util.*;

public class Type{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int pos=0,neg=0,zero=0;
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
            else{
                zero++;
            }
        }
        System.out.println("Positive: "+pos);
        System.out.println("Negative: "+neg);
        System.out.println("Zero: "+zero);
    }
}
