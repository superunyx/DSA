import java.util.*;

public class Findelement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("Enter the no you want to find: " );
        int number=sc.nextInt();
        boolean isFound = false;
        for (int i=0;i<size;i++){
            if(array[i]==number){
                System.out.println("The given no is at: "+i+" index.");
                isFound=true;
                break;
            }
        }
        if(isFound==false){
            System.out.println("The given number does not exist in the array.");
        } 
    }
}
