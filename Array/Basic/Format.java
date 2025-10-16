import java.util.*;

public class Format{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the array: ");
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("The given arrray is:\t");
        for (int i=0;i<array.length;i++){
            System.out.print(array[i]+"\t");
        }
    }
}

        

