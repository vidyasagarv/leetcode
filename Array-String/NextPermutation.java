public class NextPermutation {
    
    public void reverse(int[] nums, int first, int last){
        while(first < last){
            swap(nums, first, last);
            first++;
            last--;
        }
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    public void nextPermutation(int[] nums) {
        if(nums == null || nums.length == 0 || nums.length == 1){
            return;
        }
        int a = 0;
        int b = 0;
        for(int i = nums.length-2; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                a = i;
                break;
            }
        }
        
        for(int i = nums.length-1; i > a; i--){
            if(nums[i] > nums[a]){
                b = i;
                break;
            }
        }
        
        if(a == 0 && b == 0){
            //next permutation which is the smallest possible number
            reverse(nums, 0, nums.length-1);
            return;
        }
        
        swap(nums, a, b);
        
        if(a < nums.length-1){
            reverse(nums, a+1, nums.length-1);
        }
    }
}