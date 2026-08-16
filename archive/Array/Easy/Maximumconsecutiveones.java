import java.util.*;

public class Maximumconsecutiveones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int count=0;
        int max=0;
        for (int i=0;i<size;i++){
            if(arr[i]==1){
                count++;
                if(count>max){
                    max=count;
                }
            }
            else{
                count=0;
            }
        }
        System.out.println(max);

    }
}
