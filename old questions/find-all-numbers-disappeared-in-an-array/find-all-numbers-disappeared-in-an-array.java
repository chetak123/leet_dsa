class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
    
        CyclicSort(nums);
        List<Integer> ans = new ArrayList<>();
        for (int i=0;i<nums.length;i++){
            if ((i+1)!=nums[i]){
                ans.add(i+1);
            }
        }
        return ans;
        
    }
      static void CyclicSort(int[] arr){
        int i = 0;
        while (i<(arr.length)){
            int corr = arr[i]-1;
            if (arr[i]!=arr[corr]){
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