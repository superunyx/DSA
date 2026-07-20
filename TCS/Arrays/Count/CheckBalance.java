import java.util.*;

public class CheckBalance{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int pos=0,neg=0;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>0){
                pos++;
            }
            else if(arr[i]<0){
                neg++;
            }
        }
        if(pos==neg){
            System.out.println("Balanced");
        }
        else{
            System.out.println("Not Balanced");
        }
    }
}
