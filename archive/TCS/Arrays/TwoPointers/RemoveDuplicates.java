import java.util.*;

public class RemoveDuplicates{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        if (n==0){
            System.out.println("0");
            return;
        }
        else if(n==1){
            System.out.println("Only One Unique Element");
            return;
        }
        boolean identical=true;
        int a=0,count=1;
        for(int b=1;b<n;b++){
            if(arr[a]!=arr[b]){
                a++;
                arr[a]=arr[b];
                count++;
                identical=false;
            }
        }
        if(identical){
            System.out.println("Only One Unique Element");
        }
        else{
            System.out.print(count+" ");
            for(int i=0;i<a+1;i++){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
