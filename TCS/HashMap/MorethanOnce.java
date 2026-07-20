import java.util.*;

public class MorethanOnce{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        boolean found=false;
        for (int i=0;i<n;i++){
            if(map.get(arr[i])==0){
                map.put(arr[i],1);
            }
            else{
                System.out.println(arr[i]);
                found=true;
                return;
            }
        }
        if(!found){
            System.out.println("-1");
        }
    }
}

