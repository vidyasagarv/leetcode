public class ReverseInteger {
    public int reverse(int x) {
        int num = x;
        if(x < 0){
            num = -x;
        }
        
        long result = 0;
        while(num > 0){
            result =  result*10 + num%10;
            num = num/10;
        }
        
        if(result > Integer.MAX_VALUE){
            return 0;
        }
        
        if(x < 0){
            result = -result;
        }
        
        return (int) result;
    }
}