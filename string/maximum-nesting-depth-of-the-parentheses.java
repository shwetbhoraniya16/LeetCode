class Solution {
    public int maxDepth(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        int max = 0;
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                count++;
                if(max < count){
                    max = count;
                }
            }else if(ch == ')'){
                st.pop();
                count--;
            }
        }
        return max;
    }
}