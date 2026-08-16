import java.util.*;

public class Sort012{
    public static void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0;
        int high=n-1;
        while(mid<=high){
            if(nums[mid]==0){
                int temp=nums[mid];
                nums[mid]=nums[low];
                nums[low]=temp;
                low++;
                mid++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                int temp=nums[mid];
                nums[mid]=nums[high];
                nums[high]=temp;
                high--;
            }
        }   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array(0/1/2): ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }

}

