import java.util.*;
// only works for 2 sorted arrays
//
//
public class Union{
    public static int[] union(int[] nums1, int[] nums2){
        int[] res = new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<=nums2[j]){
                if(k==0 || res[k-1]!=nums1[i]){
                    res[k]=nums1[i];
                    k++;
                }
                i++;
            }
            else{
                if(k==0 || res[k-1]!=nums2[j]){
                    res[k]=nums2[j];
                    k++;
                }
                j++;
            }
        }
        while(i<nums1.length){
            if(k==0 || res[k-1]!=nums1[i]){
                res[k]=nums1[i];
                k++;
            }
            i++;
        }
        while(j<nums2.length){
            if(k==0 || res[k-1]!=nums2[j]){
                res[k]=nums2[j];
                k++;
            }
            j++;
        }
        int[] actualres = new int[k];
        for (int x=0;x<k;x++){
            actualres[x]=res[x];
        }
        return actualres;
    }
    public static void main(String[] args){
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
        int[] res = union(array, array2);
        System.out.println("Union:\t");
        for (int i=0;i<res.length;i++){
            System.out.print(res[i]+"\t");
        }
    } 
}
