class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length - 1;
        int ans = 0;
        while(l < r){
            int w = r - l;
            int ht = Math.min(h[l], h[r]);
            int area = w*ht;
            ans = Math.max(ans, area);
            if(h[l] < h[r]){
                l++;
            }else{
                r--;
            }
        }
        return ans;
    }
}