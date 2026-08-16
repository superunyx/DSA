import java.util.*;

public class Basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //counting the frequency of element in an array
        int[] arr = new int[5];
        System.out.println("Enter the elements in the array: ");
        for (int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        List<List<Integer>> ans= new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else{
                map.put(arr[i],1);
            }
        }

        // another method can be to use getorDefault
        // assign the haspmap into a set using .entrySet()
        //
        // Set<Integer> set = map.entrySet();
        //
        // iterate in the set 
        //
        // for(int val: set){
        //      map.put(arr[i],map.getorDefault(num,0)+1);
        // }
        for(Map.Entry<Integer,Integer>e: map.entrySet()){
            List<Integer> list = new ArrayList<>();
            list.add(e.getKey());
            list.add(e.getValue());
            ans.add(list);
        }
        System.out.println(ans);

    }
}
