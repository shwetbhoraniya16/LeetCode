class Solution {
    public int maxVowels(String s, int k) {

        int count = 0;
        for(int i=0; i<k; i++){
            char ch = s.charAt(i);
            if(isVowel(ch)){
                count++;
            }
        }
        int maxcount = count;
        for(int i=k; i<s.length(); i++){
            if(isVowel(s.charAt(i - k))){
               count--;
            }
            if(isVowel(s.charAt(i))){
                count++;
            }
            maxcount = Math.max(maxcount, count);
        }
        return maxcount;
    }
    public boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' ||
               ch == 'o' || ch == 'u';
    }
}