/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class FirstBadVersion extends VersionControl {
    public int firstBadVersion(int n) {
        int first = 1;
        int last = n;
        while(first < last){
            // use this instead of mid = (first + last)/2, 
            // since the sum could be out of integer range
            int mid = first + (last-first)/2;
            if(isBadVersion(mid)){
                last = mid; 
            } else {
                first = mid + 1;
            }
        }
        if(isBadVersion(first)){
            return first;
        }
        return last;
    }
}