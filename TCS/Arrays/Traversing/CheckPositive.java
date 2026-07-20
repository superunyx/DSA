import java.util.*;

public class CheckPositive{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        boolean present = false;
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<n;i++){
            if(arr[i]>0){
                System.out.print(arr[i]+" ");
                present=true;
            }
        }
        if(!present){
            System.out.println("No Positive Elements");
        }
    }
}
