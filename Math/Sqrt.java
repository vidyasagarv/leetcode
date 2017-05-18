public class Sqrt {
    public int mySqrt(int x) {
        if(x < 2){
            return x;
        }
        int first = 1;
        int last = x;
        int result = 1;
        while(first <= last){
            int mid = first + (last-first)/2;
            if(mid > x/mid){
                last = mid - 1;
            } else{
                if((mid + 1) > x/(mid + 1)){
                    result = mid;
                    break;
                }
                first = mid + 1;
            }
        }
        return result;
    }
}