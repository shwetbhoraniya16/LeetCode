class Solution {
    public boolean checkDivisibility(int n) {
        String s = Integer.toString(n);
        int sum = 0;
        int product = 1;
        
        for (int i = 0; i < s.length(); i++) {
            // Subtract '0' to convert ASCII value to the real number
            int digit = s.charAt(i) - '0'; 
            sum = sum + digit;
            product = product * digit;
        }
        
        int total = sum + product;
        return n % total == 0;
    } 
}
