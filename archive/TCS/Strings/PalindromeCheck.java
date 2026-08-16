import java.util.*;
import java.io.*;

public class PalindromCheck{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean palindrome=true;
        for (int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                palindrome=false;
                break;
            }
        }
        if(s.length()==0){
            System.out.println("True");
        }
        else if(palindrome){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
