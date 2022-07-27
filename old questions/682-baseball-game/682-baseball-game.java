class Solution {
    public int calPoints(String[] ops) {
        /*
        ArrayList<Integer> list = new ArrayList<>();
        int len=ops.length();
        int curr=0;
        int prev=0;
        for (int i =0;i<len;i++){
            if (ops[i]=="D"){
                curr=curr*2;
                list.add(curr);
            }
            else if(ops[i]=="C"){
                int index = list.size() - 1;
  
                // Delete last element by passing index
                list.remove(index);
                
            }
            else if(ops[i]=="+"){
                int ind = list.size() - 1;
                int ind2 = list.size() - 2;
                list.add(list[ind]+list[ind2]);
            }
            else{
                curr=Integer.parseInt(ops[i]);
                list.add(curr);
            }
        }
        return len;
        */
        
        List<Integer> scores = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < ops.length; i++) {
            int hi = scores.size() - 1;
            
            if ("+".equals(ops[i])) {
                scores.add(scores.get(hi) + scores.get(hi - 1));
            } else if ("D".equals(ops[i])) {
                scores.add(scores.get(hi) * 2);
            } else if ("C".equals(ops[i])) {
                sum -= scores.remove(hi);
                continue;
            } else {
                scores.add(Integer.valueOf(ops[i]));
            }
            sum += scores.get(scores.size()-1);
        }
        return sum;

    }
}