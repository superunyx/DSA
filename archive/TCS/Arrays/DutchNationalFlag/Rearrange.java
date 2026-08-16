import java.util.*;
//optimal but not ideal
public class Rearrange{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==0){
            return;
        }
        else if(n==1){
            System.out.print(arr[0]);
            return;
        }
        int zero=0;
        int oneortwo=n-1;
        while(zero<oneortwo){
            if(arr[zero]==0){
                zero++;
            }
            else if(arr[oneortwo]==1 || arr[oneortwo]==2){
                oneortwo--;
            }
            else{
                arr[oneortwo]=arr[zero];
                arr[zero]=0;
                zero++;
                oneortwo--;
            }
        }
        //after this all the zeroes are set on the left and 1s and 2s are on the right
        //
        //next we segreegate ones and twos in the same way
        //
        int one=zero;
        int two=n-1;
        while(one<two){
            if(arr[one]==1){
                one++;
            }
            else if(arr[two]==2){
                two--;
            }
            else{
                arr[one]=1;
                arr[two]=2;
                one++;
                two--;
            }
        }
        //now they are properly sorted.
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

