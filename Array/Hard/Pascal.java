import java.util.*;
//
//
//Type 1 return the element when a row and column is given (r-1Cc-1)
//type 2 return a row
//type 3 return the triangle for the given row in a list of lists.
//
//
public class Pascal{
    public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=1;i<=numRows;i++){
            int element=1;
            List<Integer> temp= new ArrayList<>();
            for (int j=0;j<i;j++){
                if(j==0){
                    temp.add(1);
                }
                else{
                    element*=(i-j);
                    element/=(j);
                    temp.add(element);
                }
            }
            ans.add(temp);   
        }
        return ans;
    }
    public static int generateElement(int n, int r){
        int res=1;
        for (int i=0;i<r;i++){
            res*=(n-i);
            res/=(i+1);
        }
        return res;
    }
    public static int[] generateRow(int row){
        int res=1;
        int[] arr = new int[row+1];
        arr[0]=1;
        for (int i=1;i<=row;i++){
            res*=(row-i+1);
            res/=i;
            arr[i]=res;
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter a choice: ");
            System.out.println("1.Generate one element.");
            System.out.println("2.Generate one row.");
            System.out.println("3.Generate triangle.");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("Enter the row of element: ");
                    int row1= sc.nextInt();
                    System.out.print("Enter the column of the element: ");
                    int col1= sc.nextInt();
                    int ans = generateElement(row1-1,col1-1);
                    System.out.println("The generated element is: "+ans);
                    break;
                case 2:
                    System.out.print("Enter the row you want to generate: ");
                    int row2 =sc.nextInt();
                    int[] ans2=generateRow(row2-1);
                    System.out.print("The generated row is: ");
                    for (int i=0;i<ans2.length;i++){
                        System.out.print(ans2[i]);
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.print("Enter the rows you want to generate: ");
                    int row3= sc.nextInt();
                    List<List<Integer>> ans3=generateTriangle(row3);
                    System.out.print("[");
                    for (int i=0;i<row3;i++){
                        System.out.print("[");
                        for (int j=0;j<ans3.get(i).size();j++){
                            System.out.print(ans3.get(i).get(j)+",");
                        }
                        System.out.print("],");
                    }
                    System.out.print("]");
                    System.out.println();
                    break;
                default:
                    System.out.println("Enter a valid choice.");
                    break;
            }
        }
    }
}
