class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        
        List<Integer> L = new ArrayList<>();
        List<List<Integer>> ans = new ArrayList<>();
        Combi(candidates,target,L,0,ans);
        return ans;
    }
    public static void Combi(int[] num,int amount,List<Integer> L,int ind, List<List<Integer>> ans){
        if (amount==0){
            ans.add(new ArrayList<>(L));
            return;
        }
        for (int i=ind;i<num.length;i++){
            if (amount >=num[i]){
                L.add(num[i]);
                Combi(num,amount-num[i],L,i,ans);
                L.remove(L.size()-1);
            }
        }
    }
}