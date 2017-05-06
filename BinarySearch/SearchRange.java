public class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        
        int[] range = new int[]{-1, -1};
        if(nums == null || nums.length == 0){
            return range;
        }
        
        binarySearch(nums, 0, nums.length - 1, target, range);
        return range;
    }
    
    public void binarySearch(int[] nums, int first, int last, int target, int[] range){
        if(last < first){
            return;
        }
        if(nums[first] == nums[last] && nums[first] == target){
            range[0] = first;
            range[1] = last;
            return;
        }
        
        int mid = first + (last-first)/2;
        if(nums[mid] > target){
            binarySearch(nums, first, mid - 1, target, range); 
        } else if(nums[mid] < target) {
            binarySearch(nums, mid + 1, last, target, range);
        } else{
            range[0] = mid;
            range[1] = mid;
            
            //handle left duplicates
            int t1 = mid;
            while(t1 > first && nums[t1] == nums[t1-1]){
                t1--;
                range[0] = t1;
            }
            
            //handle right duplicates 
            int t2 = mid;
            while(t2 < last && nums[t2] == nums[t2+1]){
                t2++;
                range[1] = t2;
            }
            return;
        }
        
    }
}