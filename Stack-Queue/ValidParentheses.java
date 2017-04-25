public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character,Character> parensMap = new HashMap<>();
        parensMap.put('(',')');
        parensMap.put('[',']');
        parensMap.put('{','}');
        parensMap.put('<','>');
        
        Stack<Character> brackets = new Stack<>();
        for(int i = 0; i < s.length(); ++i){
            char curr = s.charAt(i);
            if(parensMap.keySet().contains(curr)){
                brackets.push(curr);
            }
            if(parensMap.values().contains(curr)){
                if(!brackets.isEmpty() && parensMap.get(brackets.peek()) == curr){
                    brackets.pop();
                } else{
                    return false;
                }
            }
        }
        return brackets.isEmpty();
    }
}