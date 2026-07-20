import java.util.*;

public class Most{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max=0;
        int pos=0,neg=0;zero=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
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
        if(pos>neg&&pos>zero){
            System.out.println("Positive");
        }
        else if(neg>pos && neg>zero){
            System.out.println("Negative");
        }
        else if(zero>pos && zero>neg){
            System.out.println("Zero");
        }
        else{
            System.out.println("Tie");
        }
    }
}
