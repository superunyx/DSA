import java.util.*;
//
//
//Print matrix in a spiral manner return a list
//
//
public class Printinspiral{
    public static List<Integer> spiral(int[][] arr){ 
        List<Integer> ans = new ArrayList<>();
        int top=0;
        int left=0;
        int row=arr.length;
        int col=arr[0].length;
        int bottom=row-1;
        int right=col-1;
        while(top<=bottom && left<=right){
            for (int j=left;j<=right;j++){
                ans.add(arr[top][j]);
            }
            top++;
            for (int i=top;i<=bottom;i++){
                ans.add(arr[i][right]);
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    ans.add(arr[bottom][j]);
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(arr[i][left]);
                }
                left++;
            }
        }
        return ans;
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
        System.out.println("The list in a spiral manner is : ");
        List<Integer> list = spiral(matrix);
        for (int val : list){
            System.out.print(val+"\t");
        }
    }
}

