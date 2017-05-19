public class RotateArray {
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end-1];
            nums[end-1] = temp;
            start++;
            end--;
        }
    }
    
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        reverse(nums, 0, n);
        reverse(nums, 0, k);
        reverse(nums, k, n);
    }
}