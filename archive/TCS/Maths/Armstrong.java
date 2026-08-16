import java.util.*;

public class Armstrong{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int original=n;
        int count=0;
        while(n!=0){
            n/=10;
            count++;
        }
        int sum=0;
        int x=original;
        while(x!=0){
            int digit=x%10;
            sum+=(int)Math.pow(digit,count);
            x/=10;
        }
        if(sum==original){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

