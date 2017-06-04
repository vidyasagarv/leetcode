public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int curr = 0, max = 0;
        for(int n: nums){
            curr = (n==1)? curr+1: 0;
            max = Math.max(curr, max);
        }
        return max;
    }
}