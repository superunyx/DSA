import java.util.*;

public class Sumofarray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of first array: ");
        int[] array = new int[size];
        for (int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int size2 = sc.nextInt();
        System.out.println("Enter the elements of second array: ");
        int[] array2 = new int[size2];
        for (int i=0;i<size2;i++){
            array2[i]=sc.nextInt();
        }
        int[] res = new int[size>size2?size:size2];
        int c=0;
        int i=size-1;
        int j=size2-1;
        int k=res.length-1;

        while(k>=0){
            int digit=c;
            if (i>=0){
                digit+=array[i];
            }
            if (j>=0){
                digit+=array2[j];
            }
            res[k]=digit%10;
            c=digit/10;
            i--;
            j--;
            k--;
        }
        if(c!=0){
           System.out.print(c); 
        }

        for (int x=0;x<res.length;x++){
            System.out.print(res[x]);
        }
    }
}
