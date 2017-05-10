public class TwoSumUnsorted {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null || nums.length == 0){
            return new int[]{-1, -1};
        }
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = {-1, -1};
        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]), i};
            } else{
                map.put(target - nums[i], i);
            }
        }
        return new int[]{-1, -1};
    }
}