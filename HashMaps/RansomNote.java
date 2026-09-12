class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i=0;i<magazine.length();i++){
            map.put(magazine.charAt(i),map.getOrDefault(magazine.charAt(i),0)+1);
        }
        HashMap<Character,Integer> note = new HashMap<>();
        for (int i=0;i<ransomNote.length();i++){
            note.put(ransomNote.charAt(i),note.getOrDefault(ransomNote.charAt(i),0)+1);
        }
        for (char c : note.keySet()){
            if(map.getOrDefault(c,0)>=note.get(c)){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
}
