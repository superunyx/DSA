import java.util.*;

public class MoveZeroesToEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int a=0,b=1;
        if(n==1){
            System.out.println(arr[0]+" ");
            return;
        }
        else if(n==0){
            return;
        }
        int count=0;
        while(a<n && b<n){
            while(arr[a]!=0 && a<n){
                a++;
            }
            while(arr[b]==0 && b<n){
                b++;
            }
            if(arr[a]==0 && arr[b]!=0 && a<n && b<n){
                arr[a]=arr[b];
                arr[b]=0;
                a++;
                b++;
            }
            while(arr[b]==0 && b<n){
                b++;
            }
        }
        for (int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
            

                
