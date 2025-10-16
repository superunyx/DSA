import java.util.*;

public class Bubble{
    public static void bubble(int arr[], int n){
        for (int i=n-1;i>=1;i--){
            for (int j=0;j<=i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp= arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

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
        bubble(arr,size); 
        System.out.println("Sorted arrray:\t");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        } 
    }
}
