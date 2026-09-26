class Solution {
    public int[] nextGreaterElement(int[] n1, int[] n2) {
        HashMap<Integer, Integer> m = new HashMap<>();
        Stack<Integer> s = new Stack<>();
        for(int i=n2.length-1; i>=0; i--){
            while(!s.isEmpty() && s.peek() <= n2[i]){
                s.pop();
            }
            if(s.isEmpty()){
                m.put(n2[i], -1);
            }
            else{
                m.put(n2[i], s.peek());
            }
            s.push(n2[i]);
        }
        int[] ans = new int[n1.length];
        for(int i=0; i<n1.length; i++){
            ans[i] = m.get(n1[i]);
        }
        return ans;
    }
}