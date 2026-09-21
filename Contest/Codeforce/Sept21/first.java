import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int number=sc.nextInt();
            //String s=sc.next();
            //String[] st = s.split(" ");
            int[] arr = new int[3];
            for (int j=0;j<3;j++){
                arr[j]=sc.nextInt();
            }
            int min=Integer.MAX_VALUE;
            for(int x=0;x<arr.length;x++){
                if(arr[x]<min){
                    min=arr[x];
                }
            }
            int ans=number-min;
            System.out.println(ans);
        }
    }
}
