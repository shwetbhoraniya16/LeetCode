class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int med = nums[nums.length/2];
        int c = 0;
        for(int num : nums){
            c += Math.abs(med - num);
        }
        return c;
    }
}