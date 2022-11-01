import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int ans=0;
        for (int i=0;i<=nums.length-1;i++){
            System.out.println(nums[i]);
            if (i!=0 && nums[i]==nums[i-1]){
                ans = nums[i];
                

            }
        }
        return ans;
    }
}
