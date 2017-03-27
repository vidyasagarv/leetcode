public class RemoveDuplicates {

	public static int removeDuplicates(int[] nums) {
        int j = 0; // j+1 is length here
        for(int i = 1; i< nums.length; i++){
            if(nums[i] != nums[j]){
                j++;
                nums[j] = nums[i];
            }
        }
        return j + 1;
	}
}