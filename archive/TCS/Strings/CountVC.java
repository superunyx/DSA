import java.util.*;
import java.io.*;

public class CountVC{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int count=0;
        for (int i=0;i<s.length();i++){
            if(set.contains(s.charAt(i))){
                count++;
            }
        }
        int consonents=s.length()-count;
        System.out.print(count+" "+consonents);
    }
}
