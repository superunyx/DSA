import java.util.*;

public class Pyramid{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int row = sc.nextInt();
        for (int i=0;i<row;i++){
            // printing spaces
            for (int j=row-i-1;j>=0;j--){
                System.out.print("\t");
            }
            // printing stars
            for (int j=0;j<(2*i)+1;j++){
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
