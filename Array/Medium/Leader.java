import java.util.*;

public class Leader{
    public static List<Integer> leaders(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n=nums.length;
        int leader=nums[n-1];
        if(n==0){
            return list;
        }
        list.add(leader);
        for (int i=n-2;i>=0;i++){
            if (nums[i]>leader){
                list.add(nums[i]);
                leader=nums[i];
            }
        }
        return list;
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> ans = leaders(arr);
        System.out.println(ans);
     
    }
}
