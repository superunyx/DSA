import java.util.*;

public class Quicksort{
    public static void quick(int[] array,int low,int high){
        if(low>=high){
            return;
        }
        int pid=partition(array,low,high);
        quick(array,low,pid-1);
        quick(array,pid+1,high);
    }
    public static int partition(int[] array, int low, int high){
        int i=low;
        int j=high;
        int pivot=array[low];
        while(i<j){
            while(array[i]<=pivot && i<high){
                i++;
            }
            while(array[j]>pivot && j>low){
                j--;
            }
            if(i<j){
                int temp=array[j];
                array[j]=array[i];
                array[i]=temp;
            }
        }
        int temp= array[j];
        array[j]=pivot;
        array[low]=temp;
        return j;
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
        quick(array,0,size-1);
        System.out.print("The sorted array is:\t");
        for (int i=0;i<size;i++){
            System.out.print(array[i]+"\t");
        }

    }
}
