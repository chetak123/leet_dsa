class Solution {
    public void rotate(int[] nums, int k) {
/*        
        int mod_k = k % nums.length;

        int i = 0;
        int j = nums.length-1;
        int temp =0;
        
        while (i < j){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            k--;
        }
        System.out.println(nums);
        
        i = 0;
        j = mod_k-1;
        
        while (i < j){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            k--;
        }
        i = mod_k;
        j = nums.length-1;
        while (i < j){
            temp = nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            k--;
        }
        
        //return nums;
    }
*/
        
    k %= nums.length;
    reverse(nums, 0, nums.length - 1);
    reverse(nums, 0, k - 1);
    reverse(nums, k, nums.length - 1);
}

public void reverse(int[] nums, int start, int end) {
    while (start < end) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }

 }
}