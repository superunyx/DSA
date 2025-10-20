import java.util.*;

public class Dplace{
    public static void reverse(int[] arr, int low, int high){
        int i=low;
        int j=high;
        while(i<j){
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
            i++;
            j--;
        }

    }
    public static void leftrotate(int[] arr,int n,int d){
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }
    public static void rightrotate(int[] arr,int n, int d){
        reverse(arr,0,n-d-1);
        reverse(arr,n-d,n-1);
        reverse(arr,0,n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
       System.out.print("Enter the rotations you want to perform: ");
       int d=sc.nextInt();
       d=d%size;
       System.out.println("Enter the direction you want the rotations to be: ");
       System.out.println("1. Left");
       System.out.println("2. Right");
       int dir=sc.nextInt();
       if(dir==1){
           leftrotate(arr, size, d);
       }
       else if (dir==2){
           rightrotate(arr,size,d);
       }
       else{
           System.out.println("Please enter a valid option(<or>)");
       }
       System.out.print("The array after rotation is:\t");
       for (int i=0;i<size;i++){
           System.out.print(arr[i]+"\t");
       }
 
    }
}
