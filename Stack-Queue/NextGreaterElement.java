public class NextGreaterElement {
    public int[] nextGreaterElement(int[] findNums, int[] nums) {
        Map<Integer, Integer> nextGreaterElem = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int num : nums) {
            while (!stack.isEmpty() && stack.peek() < num)
                nextGreaterElem.put(stack.pop(), num);
            stack.push(num);
        }   
        for (int i = 0; i < findNums.length; i++)
            findNums[i] = nextGreaterElem.getOrDefault(findNums[i], -1);
        return findNums;
    }
}