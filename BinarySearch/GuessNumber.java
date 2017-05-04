/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class GuessNumber extends GuessGame {
    public int guessNumber(int n) {
        int first = 1;
        int last = n;
        int mid = last;
        while(first <= last){
            mid = first + (last-first)/2;
            int retVal = guess(mid);
            if(retVal == 0){
                break;
            }
            else if(retVal < 0){
                last = mid; 
            } else {
                first = mid + 1;
            }
        }
        return mid;
    }
}