import java.util.*;

public class RansomNote{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String r = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<r.length();i++){
            map.put(r.charAt(i),map.getOrDefault(r.charAt(i),0)+1);
        }
        String s = sc.next();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }
        for ( char key : map.keySet()){
            if(map.get(key)>map2.getOrDefault(key,0)){
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}
