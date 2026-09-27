class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = -1;
        }
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<2*n; i++){
            int idx = i%n;
            while(!st.isEmpty() && nums[st.peek()] < nums[idx]){
                arr[st.pop()] = nums[idx];
            }
             if(i<n){
            st.push(idx);
        }
        }
        return arr;
    }
}