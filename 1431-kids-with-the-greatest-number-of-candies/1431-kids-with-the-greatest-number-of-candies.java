import java.util.*;
import java.util.stream.*;

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        Boolean[] actSol = new Boolean[candies.length];
        for (int i = 0; i<=candies.length-1 ; i++){
            int sol=candies[i]+extraCandies;
            Boolean temp = true; 
            for (int k = 0; k<=candies.length-1 ; k++){
                if (candies[k] > sol){
                    temp=false;
                }
            }
            if (temp==true){
                actSol[i]=true;
            }else{
                actSol[i]=false;
            }
        }
        List<Boolean> act = Arrays.asList(actSol);
        return act;
    }
}