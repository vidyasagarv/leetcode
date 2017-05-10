public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int zeroIndex, elemIndex;
        for(zeroIndex = 0; zeroIndex < nums.length; zeroIndex++){
            for(elemIndex = zeroIndex + 1; elemIndex < nums.length; elemIndex++){
                if(nums[zeroIndex] == 0 && nums[elemIndex] != 0){
                    nums[zeroIndex] = nums[elemIndex];
                    nums[elemIndex] = 0;
                }
            }
        }
    }
}