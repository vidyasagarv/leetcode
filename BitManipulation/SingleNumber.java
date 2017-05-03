public class SingleNumber {
    public int singleNumber(int[] nums) {
        int single = 0;
        for(int i = 0; i < nums.length; i++){
        	// XOR of two same numbers is zero
            single = nums[i] ^ single;
        }
        return single;
    }
}