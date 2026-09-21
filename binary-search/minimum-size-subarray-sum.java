class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int low = 0;
        int high = 0;
        int currentsum = 0;
        int min = Integer.MAX_VALUE;
        while(high < nums.length){
            currentsum += nums[high];
            high++;

            while(currentsum >= target){
                int minwindowsize = high - low;
                min = Math.min(min, minwindowsize);
                currentsum -= nums[low];
                low++;
            }
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}