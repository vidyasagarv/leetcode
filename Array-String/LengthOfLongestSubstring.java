public class LengthOfLongestSubstring {
    
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() == 1){
            return 1;
        }
        Set<Character> freq = new HashSet<>();
        int max = 0;
        int start = 0;
        for(int i = 0; i< s.length(); i++){
            char c = s.charAt(i);
            if(!freq.contains(c)){
                freq.add(c);
            } 
            else {
                max = Math.max(max,freq.size());
                while(start<i && s.charAt(start)!=c){
                    freq.remove(s.charAt(start));
                    start++;
                }
                start++;
            }
        }
        return Math.max(max,freq.size());
    }
}