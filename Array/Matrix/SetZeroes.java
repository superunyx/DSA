import java.util.*;
//
//
//Covert the row and column into zero where zero is present in a matrix of 0s and 1s.
//
//
public class SetZeroes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows in the matrix: ");
        int row = sc.nextInt();
        System.out.print("Enter the no of columns in the matrix: ");
        int col = sc.nextInt();
        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements in the matrix(0/1): ");
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
        int col0=matrix[0][0];
        for (int i=row-1;i>=0;i--){
            for (int j=col-1;j>=0;j--){
                if (matrix[i][j]==0){
                    if(j==0){
                        col0=0;
                    }
                    else{
                        matrix[0][j]=0;
                        matrix[i][0]=0;
                    }
                }
            }
        }
        for (int i=row-1;i>=1;i--){
            for(int j=col-1;j>=1;j--){
                if(matrix[0][j]==0 || matrix[i][0]==0){
                    matrix[i][j]=0;
                }
            }             
        }
        if (matrix[0][0]==0){
            for (int j=col-1;j>=1;j--){
                matrix[0][j]=0;
            }
        }
        if (col0==0){
            for (int i=row-1;i>=0;i--){
                matrix[i][0]=0;
            }
        }
        System.out.println("The matrix after setting zeroes is: ");
        for (int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.print("\n");
        }
    }
}
