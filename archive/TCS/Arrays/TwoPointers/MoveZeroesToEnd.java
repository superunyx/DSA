import java.util.*;

public class MoveZeroesToEnd{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i =0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if(n==1){
            System.out.println(arr[0]+" ");
            return;
        }
        else if(n==0){
            return;
        }
        int a=0;
        for (int b=0;b<n;b++){
            if(arr[b]!=0){
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
                a++;
            }
        }

        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
            

                
