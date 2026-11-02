class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if(p.length() > s.length()){
            return ans;
        }
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();
        for(int i=0; i<p.length(); i++){
            char ch1 = p.charAt(i);
            char ch2 = s.charAt(i);
            m1.put(ch1, m1.getOrDefault(ch1, 0) + 1);
            m2.put(ch2, m2.getOrDefault(ch2, 0) + 1);
        }
        if (m1.equals(m2)) {
            ans.add(0);
        }
        int l = 0;
        int k = p.length();
        for(int r = k; r<s.length(); r++){
            char incoming = s.charAt(r);
            m2.put(incoming, 1 + m2.getOrDefault(incoming, 0));

            char outgoing = s.charAt(l);
            m2.put(outgoing, m2.get(outgoing) - 1);
            if(m2.get(outgoing) == 0){
                m2.remove(outgoing);
            }
            l++;
            if(m2.equals(m1)){
                ans.add(l);
            }
        }
        return ans;
    }
}