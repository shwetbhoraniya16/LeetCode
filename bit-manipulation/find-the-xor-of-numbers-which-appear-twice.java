class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        int ans = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(set.contains(num)){
                ans ^= num;
            }else{
                set.add(num);
            }
        }
        return ans;
    }
}
