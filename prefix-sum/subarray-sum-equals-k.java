class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int prefix = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        for(int num : nums){
            prefix += num;
            int val = prefix - k;
            if(map.containsKey(val)){
                count += map.get(val);
            }
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}