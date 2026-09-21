import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long ans=0;
            if(a>=b){
                a=a+c;
                ans=a-b;
            }
            else{
                ans = Math.max(b - a, (a + c) - b);
            }
            System.out.println(ans);
        }
    }
}
