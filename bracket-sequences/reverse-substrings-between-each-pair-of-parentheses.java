class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                StringBuilder t = new StringBuilder();
                while(st.peek() != '('){
                    t.append(st.pop());
                }
                st.pop();
        
                for(int j=0; j<t.length(); j++){
                    st.push(t.charAt(j));
                }

            }else{
                st.push(ch);
            }           
        }
         StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        return ans.reverse().toString();
    }
}