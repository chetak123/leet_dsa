class Solution {
    public int maxArea(int[] height) {
        
        int i = 0;
        int l = height.length-1;
        int ans=0;
        while (i<l){
            int lenth = Math.min(height[i],height[l]);
            int brth=l-i;
            int area = lenth*brth;
            ans = Math.max(ans,area);
            if (height[i]<height[l]){
                i++;
            }
            else if (height[i]>height[l]){
                l--;
            }
            else{
                i++;
            }
        }
        return ans;
        
        
    }
}