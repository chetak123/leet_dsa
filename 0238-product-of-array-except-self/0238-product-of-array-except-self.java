class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        //ArrayList<Integer> list = new ArrayList<>();
        int[] ans = new int[nums.length];
        /*
        //int temp=0
        for (int i=0;i<=nums.length-1;i++){
            int temp=1;
            for (int k=0;k<=nums.length-1;k++ ){
                if (k==i){
                    continue;
                }
                temp=temp*nums[k];
            }
            ans[i]=temp;
        }
        return ans;
        */
        int[] prefix = new int[nums.length];
        int[] postfix = new int[nums.length];
        int temp =1;
        for (int i=0;i<=nums.length-1;i++){
            if (i==0){
                temp = 1;
            }else{
                temp=prefix[i-1];
            }
            prefix[i]=temp*nums[i];
        }
        for (int i=nums.length-1;i>=0;i--){
            if (i==nums.length-1){
                temp = 1;
            }else{
                temp=postfix[i+1];
            }
            postfix[i]=temp*nums[i];
        }
        for (int i=0;i<=nums.length-1;i++){
            System.out.println(postfix[i]);
        }
        //stem.out.println(nums[nums.length-1]);
        for (int i=0;i<=nums.length-1;i++){
            int pref=1;
            int postf=1;
            if (i==0){
                pref=1;
            }else{
                pref=prefix[i-1];
            }
            if (i==nums.length-1){
                postf=1;
            }else{
                postf=postfix[i+1];
            }
            
            ans[i]=pref*postf;
        }

        
        
        return ans;


    }
}