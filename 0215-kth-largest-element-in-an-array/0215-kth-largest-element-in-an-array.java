class Solution {
    public int findKthLargest(int[] nums, int k) {
                PriorityQueue<Integer> pq =new PriorityQueue<>();
        
        //creating a min heap of k elements 
        // here the root element will be the kth largest element 
        for (int i=0;i<k;i++){
            
            pq.add(nums[i]);
            
        }
        for (int i=k;i<nums.length;i++){
            
            //if (pq.peek()<nums[i]){ // to check if the first element of queue 
                // is less than arr element, min heap root element
                pq.add(nums[i]);
 
                pq.poll(); // remove first element from queue, or root from min 
                // heap
                               //it then internally maintains the min heap
                
            //}
            
        }
        return pq.poll();

    }
}