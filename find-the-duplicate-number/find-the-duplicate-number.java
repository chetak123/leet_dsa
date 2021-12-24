class Solution {
    public int findDuplicate(int[] nums) {
        
        CyclicSort(nums);
        int i=0;

       // List<Integer> ans = new ArrayList<>();
        for (i=0;i<nums.length;i++){
            if ((i+1)!=nums[i]){
                return nums[i];
                //ans.add(i+1);

            }
        }
        return (i+1);
        
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