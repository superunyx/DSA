public class RotatedandSorted {
    public static boolean check(int[] nums) {
        int n=nums.length;
        int breaks=0;
        for (int i=0;i<n;i++){
            if(nums[i]>nums[(i+1)%n]){
                breaks++;
            }
        }
        if(breaks<=1){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0]=3;
        arr[1]=4;
        arr[2]=5;
        arr[3]=1;
        arr[4]=2;
        boolean checking = check(arr);
        System.out.println(checking);

    }
}
