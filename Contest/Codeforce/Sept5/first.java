import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no=sc.nextInt();
        for (int i=0;i<no;i++){
            int size=sc.nextInt();
            int windowsize=sc.nextInt();
            String s = sc.next();
            String[] S = s.split("");
            int[] arr = new int[s.length()];
            for (int l=0;l<s.length();l++){
                arr[l]=Integer.parseInt(S[l]);
            }
            int farms=size/windowsize;
            int count=0;
            for (int j=0;j<farms;j++){
                boolean allone=true;;
                for(int x=0;x<windowsize;x++){
                    if(arr[j*windowsize+x]==0){
                        allone=false;
                        break;
                    }
                }
                if(allone){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
