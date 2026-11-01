class Solution {
    public int minMoves(int[] nums) {
        int min = nums[0];
        for(int num : nums){
            if(num < min){
                min = num;
            }
        }
        int s = 0;
        for(int num : nums){
            s = s + num - min;
        }
        return s;
    }
}
