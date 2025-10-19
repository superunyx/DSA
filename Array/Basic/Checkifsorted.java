import java.util.*;

public class Checkifsorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        boolean isSorted=true;
        for (int i=0;i<size-1;i++){ 
            if(array[i]>array[i+1]){
                isSorted=false;
            }
        }
        System.out.println(isSorted);
    }
}
