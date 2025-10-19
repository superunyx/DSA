import java.util.*;

public class Secondsmallest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        int min=array[0];
        int secondsmallest=-1;
        for (int i=0;i<size;i++){ 
            if(array[i]<min){
                secondsmallest=min;
                min=array[i];
            }
            else if(array[i]<secondsmallest && array[i]>min){
                secondsmallest=array[i];
            }
        }
        System.out.println("The min element is: "+min);
        System.out.println("The second smallest element is: "+secondsmallest);
    }
}
