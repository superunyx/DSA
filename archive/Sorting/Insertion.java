import java.util.*;

public class Insertion{
    public static void insertion(int arr[],int n){
        for (int i=0;i<=n-1;i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array:\t");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insertion(arr,size); 
        System.out.println("Sorted arrray:\t");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }


    }
}
