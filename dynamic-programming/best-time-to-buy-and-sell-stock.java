import java.util.*;

class Solution {
    public int maxProfit(int[] prices) {
        int mp = 0;
        int bb = prices[0];
        for(int i=0; i<prices.length; i++){
            if(prices[i] > bb){
                mp = Math.max(mp,prices[i]-bb);
            }
            bb = Math.min(bb,prices[i]);
        }
        return mp;
    }
}