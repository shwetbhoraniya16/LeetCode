class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l < r){
            int currsum = nums[l] + nums[r];
            if(currsum > target){
                r--;
            }else if(currsum < target){
                l++;
            }else{
                return new int[]{l+1, r+1};
            }
        }
        return new int[]{};
    }
}