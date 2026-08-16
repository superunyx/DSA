import java.util.*;

public class Selection{
    public static void selection(int arr[],int n){
        for (int i=0;i<=n-2;i++){
            int min=i;
            for (int j=i;j<=n-1;j++){
                if (arr[j]<arr[min]){
                   min=j; 
                }
                int temp=arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);         
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array:\t");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        selection(arr,size); 
        System.out.println("Sorted arrray:\t");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }

    }
}
