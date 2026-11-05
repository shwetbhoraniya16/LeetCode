class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0;
        int r = 0;
        int maxlen = 0;
        int zero = 0;
        while( r < nums.length){
            if(nums[r] == 0){
                zero++;

            }
            if(k < zero){
                if(nums[l] == 0){
                zero--;
                }
                l++;
            }
            if(k >= zero){
                maxlen = Math.max(maxlen, r - l + 1);
            }
            r++;
        }
        return maxlen;
    }
}