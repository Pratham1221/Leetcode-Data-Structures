class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> a = new HashMap<Character,Integer>();
        HashMap<Character,Integer> b = new HashMap<Character,Integer>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i = 0;i<s.length();i++){
            if(a.containsKey(s.charAt(i))){
                a.put(s.charAt(i),a.get(s.charAt(i))+1);
            }else{
                a.put(s.charAt(i),1);
            }
        }
        for(int i = 0;i<t.length();i++){
            if(b.containsKey(t.charAt(i))){
                b.put(t.charAt(i),b.get(t.charAt(i))+1);
            }else{
                b.put(t.charAt(i),1);
            }
        }
        if(a.equals(b)){
            return true;
        }
        return false;

    }
}
