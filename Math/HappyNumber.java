public class HappyNumber {
    public boolean isHappy(int n) {
        Set<Integer> nonRepeated = new HashSet<Integer>();
        int squareSum, digit;
    	while (nonRepeated.add(n)) {
    		squareSum = 0;
    		while (n > 0) {
    		    digit = n%10;
    			squareSum += digit*digit;
    			n /= 10;
    		}
    		if (squareSum == 1)
    			return true;
    		else
    			n = squareSum;
    
    	}
    	return false;
    }
}