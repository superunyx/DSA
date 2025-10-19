import java.util.*;

public class Mergesorted{
    public static int[] mergesorted(int[] arr1,int[] arr2){
        int[] res = new int[arr1.length+arr2.length];
        int a=0,b=0,k=0;
        while(a<arr1.length && b<arr2.length){
            if (arr1[a]<arr2[b]){
                res[k]=arr1[a];
                k++;
                a++;
            }
            else{
                res[k]=arr2[b];
                k++;
                b++;
            }
        }
        while(a<arr1.length){
            res[k]=arr1[a];
            k++;
            a++;
        }
        while(b<arr2.length){
            res[k]=arr2[b];
            k++;
            b++;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of first array: ");
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        System.out.println("Enter the first array: ");
        for (int i=0;i<size1;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the size of second array: ");
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        System.out.println("Enter the second array: ");
        for (int i=0;i<size2;i++){
            arr2[i]=sc.nextInt();
        }
        int[] res=mergesorted(arr1,arr2);
        System.err.print("Merged array is:\t");
        for (int i=0;i<size1+size2;i++){
            System.out.print(res[i]+"\t");
        }

    }
}
