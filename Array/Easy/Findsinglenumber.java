import java.util.*;
//given is all elements are in pairs except one, we have to find that element
//
// Xor the entire array and pairs will result in 0 and the single element will be found.
//
//
public class Findsinglenumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        int xor=0;
        for (int i=0;i<array.length;i++){
            xor=xor^array[i];
        }
        System.out.println("The single number is: "+xor);
    }
}

