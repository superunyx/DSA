import java.util.*;

public class Balloon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int b=0,a=0,l=0,o=0,n=0;
        for (char key : map.keySet()){
            if(key=='b'){
                b=map.get(key);
            }
            else if(key=='a'){
                a=map.get(key);
            }
            else if(key=='l'){
                l=map.get(key);
            }
            else if(key=='o'){
                o=map.get(key);
            }
            else if(key=='n'){
                n=map.get(key);
            }
        }
        l/=2;
        o/=2;
        int min=Math.min(Math.min(b,a),Math.min(l,Math.min(o,n)));
        System.out.println(min);
    }
}

