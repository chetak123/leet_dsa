class Solution {
    public int search(int[] nums, int target) {
        int ans = -1;
        int start = 0, end = nums.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if (nums[mid]>=nums[0] && target < nums[0] ){
                start = mid+1;
            }
            else if (nums[mid]<nums[0] && target >= nums[0]){
                end=mid-1;
            }
            else {
                if (nums[mid]>target){
                    end=mid-1;
                }
                else if(nums[mid]<target){
                    start=mid+1;
                }
                else{
                    ans=mid;
                    break;
                }
            }
        }
        
        return ans;
        
    }
}