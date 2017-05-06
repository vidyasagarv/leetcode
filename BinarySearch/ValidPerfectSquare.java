public class ValidPerfectSquare {
    // a perfect square is a sum of 1+3+5+...
    public boolean isPerfectSquare(int num) {
        int low = 1, high = num;
        while(low <= high){
            // Can also use mid = (low + high) >>> 1;
            long mid = low + (high - low)/2;
            if(mid*mid == num){
                return true;
            } else if(mid*mid < num){
                low = (int) mid + 1;
            } else{
                high = (int) mid - 1;
            }
        }
        return false;
    }
}