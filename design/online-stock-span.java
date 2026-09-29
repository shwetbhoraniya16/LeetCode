import java.util.*;

class StockSpanner {
     ArrayList<Integer> ans;
     Stack<Integer> s;
    public StockSpanner() {
        ans = new ArrayList<>();
        s = new Stack<>();
    }  
    public int next(int price) {
        ans.add(price);
        int i = ans.size() - 1;
        while(!s.isEmpty() && ans.get(s.peek()) <= price){
            s.pop();
        }
        int count;
        if(s.isEmpty()){
            count = i+1;
        }else{
            count = i - s.peek();
        }
        s.push(i);
        return count;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */