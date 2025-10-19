import java.util.*;

public class Largestinarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int max=array[0];
        for (int i=0;i<size;i++){
            if(array[i]>max){
                max=array[i];
            }
        }
        System.out.println("The max element is: "+max);

    }
}
