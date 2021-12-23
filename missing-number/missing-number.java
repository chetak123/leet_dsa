class Solution {
    public int missingNumber(int[] nums) {
        CyclicSort(nums);
        for (int i=0;i<nums.length;i++){
            if (i!=nums[i]){
                return i;
            }
        }
        return nums.length;
        
    }
      static void CyclicSort(int[] arr){
        int i = 0;
        while (i<(arr.length)){
            int corr = arr[i];
            if (arr[i]<arr.length && arr[i]!=arr[corr]){
                swap(arr,i,corr);
            }
            else{
                i++;
            }
        }
    }
    static void swap(int[] arr, int i, int corr) {
        int temp=arr[i];
        arr[i]=arr[corr];
        arr[corr]=temp;
    }
}

