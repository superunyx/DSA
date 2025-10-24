import java.util.*;

public class Majority2{
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int cnt1=0;
        int cnt2=0;
        int el1=Integer.MIN_VALUE;
        int el2=Integer.MIN_VALUE;
        int n=nums.length;
        for (int i=0;i<n;i++){
            if(cnt1==0 && nums[i]!=el2){
                el1=nums[i];
                cnt1++;
            }
            else if(cnt2==0 && nums[i]!=el1){
                el2=nums[i];
                cnt2++;
            }
            else if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
            else{
                cnt1--;
                cnt2--;
            }
        }
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++){
            if(nums[i]==el1){
                cnt1++;
            }
            else if(nums[i]==el2){
                cnt2++;
            }
        }
        int min=(n/3)+1;
        if(cnt1>=min){
            ans.add(el1);
        }
        if(cnt2>=min){
            ans.add(el2);
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of elements: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr= new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        List<Integer> res =majorityElement(arr);
        for (int i=0;i<res.size();i++){
            System.out.print(res.get(i)+"\t");
        }

    }
}
