public class SumTwoIntegers {
    public int getSum(int a, int b) {
        int result = a ^ b;
        int carry = (a & b)<<1;
        if(carry != 0){
            result = getSum(result, carry);
        }
        return result;
    }
}