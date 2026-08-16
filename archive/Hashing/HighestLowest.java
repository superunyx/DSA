import java.util.*;

public class HighestLowest{
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[8];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<8;i++){
            arr[i]=sc.nextInt();
        }
        int max=0,min=1;
        for (int i=0;i<7;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        int maxelement=Integer.MIN_VALUE;
        int minelement=Integer.MIN_VALUE;
        for (Map.Entry<Integer,Integer>e: map.entrySet()){
            if(e.getValue()>max){
                max=e.getValue();
                maxelement=e.getKey();
            }
            if(e.getValue()<=min){
                min=e.getValue();
                minelement=e.getKey();
            }
        }
        System.out.println("Max no is"+max+"\nTaken by"+maxelement+"\nMin no is "+min+"\nTaken by"+minelement);
    }
}
