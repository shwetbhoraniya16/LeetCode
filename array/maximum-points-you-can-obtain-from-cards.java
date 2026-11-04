class Solution {
    public int maxScore(int[] nums, int k) {
        int lsum = 0;
        int rsum = 0;
        int maxsum = 0;
        for(int i=0; i<k; i++){
            lsum += nums[i];
        }
        //TC-->O(2*k)
        maxsum = lsum;
        int n = nums.length;
        int ridx = n-1;
        for(int i=k-1; i>=0; i--){
           lsum -= nums[i];
           rsum += nums[ridx];
           ridx--;
           maxsum = Math.max(maxsum, lsum + rsum);
        }
        return maxsum;
    }
}