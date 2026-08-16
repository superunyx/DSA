import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int count=0;
        int single=0;
        for ( char key: map.keySet()){
            if(map.get(key)%2==1){
                single=1;
            }
            if(map.get(key)>1){
                if(map.get(key)%2==0){
                    count+=map.get(key);
                }
                else{
                    count+=map.get(key)-1;
                }
            }
        }
        System.out.println(count+single);
    }
}
