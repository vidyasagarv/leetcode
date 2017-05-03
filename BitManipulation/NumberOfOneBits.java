public class NumberOfOneBits {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int weight = 0;
        while(n != 0){
            n = n & (n-1);
            weight++;
        }
        return weight;
    }
}