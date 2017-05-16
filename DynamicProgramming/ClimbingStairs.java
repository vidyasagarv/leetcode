public class ClimbingStairs {
    public int climbStairs(int n) {
        int[] stairs = new int[n+1];
        stairs[0] = 1;
        stairs[1] = 1;
        if(n < 2){
            return stairs[n];
        }
        for(int i = 0; i+1 < n; i++){
            stairs[i+2] = stairs[i+1] + stairs[i];
        }
        return stairs[n];
    }
}