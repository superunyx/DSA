import java.util.*;

public class RemoveDuplicatesfromSorted{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size=sc.nextInt();
        int[] array= new int[size];
        System.out.println("Enter the elements of the array(sorted): ");
        for (int j=0;j<size;j++){
            array[j]=sc.nextInt();
        }
        int i=0,k=1;
        for (int j=1;j<size;j++){
            if(array[j]>array[i]){
                array[i+1]=array[j];
                i++;
                k++;
            }
        }
        System.out.println("The no of unique elements in the array is: "+k);
        System.out.println("After removing duplicates the array is:");
        for (int j=0;j<k;j++){
            System.out.print(array[j]+"\t");
        }
    }
}
