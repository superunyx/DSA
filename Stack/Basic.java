// basic program to learn syntax in java
//
//
//import java.util.Stack;
import java.util.*;
public class Basic{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        for (int i=0;i<arr.length;i++){
            stack.push(arr[i]);
        }
        int[] ans=new int[5];
        int index=0;
        while(!stack.isEmpty()){
            int x=stack.peek();
            stack.pop();
            ans[index]=x;
            index++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
