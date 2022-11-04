class Solution {
    public int findPeakElement(int[] nums) {
                int start = 0;
        int end = nums.length-1;
        int mid=0;
        while(start<end){
            mid = start + (end-start)/2;

            if (nums[mid]>nums[mid+1]){
                // we are decreasing part of array
                // this may be the ans and we search the left side
                end=mid;
            }else{
                //we are in increasing part of array
                // here we are sure that mid+1 > mid, so we start search from mid+1 
                start=mid+1;
            }
            if (start==end){
                return end;
            }
        }
        return 0;

    }
}