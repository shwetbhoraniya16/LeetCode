class Solution {
    public long countCommas(long n) {
        long temp = 0;
        long p = 1000;
        while(p <= n){
            temp += n - p + 1;
            p = p*1000;
        }
        return temp;
    }
}