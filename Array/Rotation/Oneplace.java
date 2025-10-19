import java.util.*;

public class Oneplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int[] arr2 = new int[size];
        for (int i=0;i<size;i++){
            arr2[i]=arr[i];
        }
        int temp=arr[0];
        for (int i=1;i<size;i++){
            arr[i-1]=arr[i];
        }
        arr[size-1]=temp;
        System.out.println("The array after one left rotation is: ");
        for (int i=0;i<size;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        int temp2=arr2[size-1];
        for (int i=size-1;i>=1;i--){
            arr2[i]=arr2[i-1];
        }
        arr2[0]=temp2;
        System.out.println("The array after one right rotation is: ");
        for (int i=0;i<size;i++){
            System.out.print(arr2[i]+"\t");
        }
    }
}
