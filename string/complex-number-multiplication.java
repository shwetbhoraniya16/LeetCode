class Solution { 
    public String complexNumberMultiply(String n1, String n2) { 
        String r1 = ""; 
        String r2 = ""; 
        String m1 = ""; 
        String m2 = ""; 
        
        for(int i=n1.length()-2; i>=0; i--){ 
            if(n1.charAt(i) == '+'){ 
                break; 
            } 
            m1 += n1.charAt(i); 
        } 
        
        for(int i=n2.length()-2; i>=0; i--){ 
            if(n2.charAt(i) == '+'){ 
                break; 
            } 
            m2 += n2.charAt(i); 
        } 
 
        m1 = new StringBuilder(m1).reverse().toString(); 
        m2 = new StringBuilder(m2).reverse().toString(); 
        
        for(int i=0; i<n1.length(); i++){ 
            if(n1.charAt(i) == '+'){ 
                break; 
            } 
            r1 += n1.charAt(i); 
        } 
        
        for(int i=0; i<n2.length(); i++){ 
            if(n2.charAt(i) == '+'){ 
                break; 
            } 
            r2 += n2.charAt(i); 
        } 
        
        int real = Integer.parseInt(r1) * Integer.parseInt(r2) 
                 - Integer.parseInt(m1) * Integer.parseInt(m2); 
 
        int imaginary = Integer.parseInt(r1) * Integer.parseInt(m2) 
                      + Integer.parseInt(r2) * Integer.parseInt(m1); 
        
        return real + "+" + imaginary + "i"; 
    } 
}