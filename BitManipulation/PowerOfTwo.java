public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
    	// check for positive and power of two
        return (n > 0) && ((n & (n - 1)) == 0);
    }
}