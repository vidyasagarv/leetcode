public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        int strVal = 0;
        int last = s.length() - 1;
        for(int i = last; i >= 0; i--){
            strVal += (int) Math.pow(26, last - i) * (s.charAt(i)-'A' + 1);
        }
        return strVal;
    }
}