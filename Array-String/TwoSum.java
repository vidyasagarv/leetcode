public class TwoSum {
	
	public static int[] twoSum(int[] numbers, int target) {
        int i = 0;
        int j = numbers.length - 1;
        while(j>i){
            int sum = numbers[i] + numbers[j];
            if(sum < target){
                i++;
            } else if(sum > target){
                j--;
            } else if(sum == target){
                int[] arr = new int[2];
                arr[0] = i+1;
                arr[1] = j+1;
                return arr;
            }
        }
        return null;
    }
}