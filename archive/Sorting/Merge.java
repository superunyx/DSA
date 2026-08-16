import java.util.*;

public class Merge{
    public static int[] mergesorted(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int a=0,b=0,k=0;
        while(a<arr1.length && b<arr2.length){
            if (arr1[a]<arr2[b]){
                res[k]=arr1[a];
                k++;
                a++;
            }
            else{
                res[k]=arr2[b];
                k++;
                b++;
            }
        }
        while(a<arr1.length){
            res[k]=arr1[a];
            k++;
            a++;
        }
        while(b<arr2.length){
            res[k]=arr2[b];
            k++;
            b++;
        }
        return res;
    }
 
    public static int[] merge(int[] array,int low, int high){
        int mid = (low+high)/2;
        if (low>=high){
            int[] ba= new int[1];
            ba[0]=array[low];
            return ba;
        }
        int[] part1 = merge(array,low,mid);
        int[] part2 = merge(array,mid+1,high);
        return mergesorted(part1,part2);
         
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int[] res=merge(array,0,size-1);
        System.out.print("The sorted array is:\t");
        for (int i=0;i<size;i++){
            System.out.print(res[i]+"\t");
        }
    }
}
