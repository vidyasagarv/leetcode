public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        if(s == null || s.length() == 0){
            return -1;
        }
        // use int[26] if the range of characters is [a-z]
        // considering ascii characters
        int[] table = new int[256];
        for(int i = 0; i < s.length(); i++){
            table[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++){
            if(table[s.charAt(i)] == 1){
                return i;
            }
        }
        return -1;
    }
}