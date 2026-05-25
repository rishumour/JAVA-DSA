// to calculate the nCr 

public class Functions_12_nCr {
    
    public static int factorialN(int n) {
        int fact = 1;
        
        
        for (int i = 1; i <= n; i++) {  // Loop from 1 to 'n', multiplying the running total 'fact' by 'i'
            fact *= i;
        }
        
        return fact;
    }
    public static int nCr(int n, int r) {   // Calculate factorials needed for the nCr formula
        int fact_n = factorialN(n);
        int fact_r = factorialN(r);
        int fact_nmr = factorialN(n - r); // nmr means n minus r..
        return fact_n / (fact_r * fact_nmr);
    }
    public static void main(String[] args) {
        int n = 8, r = 2;
        nCr(n, r);
        System.out.println("nPr = " + nCr(n, r));
    }
}