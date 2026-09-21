class Solution {
    public int[] leftRightDifference(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum += num;
        }
        int left = 0;
        int[] ans = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int right = sum - left - nums[i];
            ans[i] = Math.abs(left - right);
            left += nums[i];
        }
        return ans;
    }
}