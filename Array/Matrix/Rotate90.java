import java.util.*;
//
//
//Rotate matrix 90 degree clockwise
//
//
public class Rotate90{
    public static void reverse(int[] arr, int low, int high){        
        int i=low;
        int j=high;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows in the matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the no of columns in the matrix: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements in the matrix: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("The given matrix is: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }
        for (int i=0;i<row;i++){
            for (int j=i;j<col;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        for (int i=0;i<row;i++){
            reverse(matrix[i],0,col-1);
        }
        System.out.println("The given matrix after rotation is: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }
 
    }
}

