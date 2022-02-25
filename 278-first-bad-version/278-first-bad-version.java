/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        // here we have to find lowest true value in a sorted array so binary search
       
        int low = 1;
        int high = n;   
        int ans=0;
        while(low<=high) {
            int mid = low+(high-low)/2; //we have done this so that high+low doesn't hit max value
            if(isBadVersion(mid)) {
    
                ans =mid;
                high = mid-1;
            }
            else {
                low = mid+1;
            }
        }

        return ans;
    }
}