class Solution {

    public boolean isFreqSame(int[] windowfreq, int[] freq) {
        for (int i = 0; i < 26; i++) {
            if (windowfreq[i] != freq[i]) {
                return false;
            }
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        int[] freq = new int[26];

        for (int i = 0; i < s1.length(); i++) {
            freq[s1.charAt(i) - 'a']++;
        }

        int windowSize = s1.length();

        for (int i = 0; i <= s2.length(); i++) {

            int[] windowfreq = new int[26];
            int windowidx = 0;
            int idx = i;
            while(windowidx < windowSize && idx < s2.length()){
                windowfreq[s2.charAt(idx) - 'a']++;
                idx++;
                windowidx++;
            }
            

            if (isFreqSame(windowfreq, freq)) {
                return true;
            }
        }

        return false;
    }
}