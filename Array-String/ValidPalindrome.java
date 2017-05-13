public class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "").toLowerCase();
        if(s == null || s.length() == 0 || s.length() ==1){
            return true;
        }
        int len = s.length();
        for(int i = 0; i <= len/2; i++){
            if(s.charAt(i) != s.charAt(len-1-i)){
                return false;
            }
        }
        return true;
    }
}