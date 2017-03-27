public class StrStr {

    public static int strStr(String haystack, String needle) {
        if(needle.length() == 0){
            return 0;
        }
        for(int i = 0; i<haystack.length(); i++){
            int m = i;
            if(i + needle.length() > haystack.length())
            return -1;
            for(int j = 0; j<needle.length(); j++){
                if(needle.charAt(j) == haystack.charAt(m)){
                    if(j == needle.length()-1){
                        return i;
                    }
                    m++;
                } else {
                    break;
                }
            }
        }
        return -1;
    }
}