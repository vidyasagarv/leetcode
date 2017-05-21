public class NextGreaterElement {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> nextGreaterInt = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : nums){
            while(!stack.isEmpty() && stack.peek() < num){
                nextGreaterInt.put(stack.pop(), num);
            }
            stack.push(num);
        }
        for(int i = 0; i < findNums.length; i++){
            if(nextGreaterInt.get(findNums[i]) != null){
                findNums[i] = nextGreaterInt.get(findNums[i]);
            } else{
                findNums[i] = -1;
            }
        }
        return findNums;
    }
}