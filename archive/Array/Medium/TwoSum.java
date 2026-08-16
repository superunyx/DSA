import java.util.*;

public class TwoSum{
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map= new HashMap<>();
        int n=nums.length;
        for (int i=0;i<n;i++){
            int comp=target-nums[i];
            if(map.containsKey(comp)){
                return new int[] {i,map.get(comp)};
            }
            map.put(nums[i],i);
        }
        return new int[2];
    }
    public static boolean twosumbool(int[] nums, int target){
        //only works for sorted array
        Arrays.sort(nums);
        int i=0;
        int j=nums.length-1;
        while(i<j){
            if(nums[i]+nums[j]==target){
                return true;
            }
            else if (nums[i]+nums[j]<target){
                i++;
            }
            else{
                j--;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the " + n + " elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the target sum (k):");
        int k = sc.nextInt();
        if(twosumbool(nums,k)){
            int[] res=twoSum(nums,k);
            System.out.print(Arrays.toString(res));
        }
        else{
            System.out.print("No two elements as such present.");
        }
 
    }
}
