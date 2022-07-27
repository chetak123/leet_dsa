class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        //public static void main(String[] args) {
        // subset question by ittration
        //int[] arr = {1,2,3};
        List<List<Integer>> ans = subset(nums);
        for (List<Integer> list : ans){
            System.out.println(list);
        }
        return ans;

    }
    static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();

        outer.add(new ArrayList<>()); // initially we have only an empty list

        //for every number in my array we have to take size of the array and add it to
        // original list
        for (int num: arr){
            int n =outer.size();
            for (int i=0;i<n;i++){
                List<Integer> internal =new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);//here individual list is getting added to main list
            }
        }
        return outer;
    }
    
        
    }
