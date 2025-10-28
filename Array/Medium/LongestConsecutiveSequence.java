import java.util.*;

public class LongestConsecutiveSequence{
    public static void main(String[] args) {
        HashSet<Integer> set= new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<size;i++){
            set.add(arr[i]);
        }
        int longest=1;
        for (int val:set){
            int x=val;
            int count=1;
            while(set.contains(x+1)){
                x++;
                count++;
            }
            longest=Math.max(longest,count);
        }
        System.out.println("Longest consecutive sequence is: "+longest);
        
    }
}
