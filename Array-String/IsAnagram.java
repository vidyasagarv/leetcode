public class IsAnagram {
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character,Integer> freqs = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(freqs.containsKey(s.charAt(i))){
                freqs.put(s.charAt(i),freqs.get(s.charAt(i))+1);
            } else {
                freqs.put(s.charAt(i),1);
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(freqs.containsKey(t.charAt(i))){
                freqs.put(t.charAt(i),freqs.get(t.charAt(i))-1);
            }
        }
        for (Map.Entry<Character, Integer> entry : freqs.entrySet()) {
            if(entry.getValue() > 0){
                return false;
            }
        }
        return true;
    }
}