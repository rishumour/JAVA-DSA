public class Functions_19_nCr_optimised {
    public static int nCr(int n, int r) {
        
        if (r > n) return 0;
        
        r = Math.min(r, n-r);
        
        long ans = 1;
        
        for (int i = 0; i < r; i++){
            ans = ans * (n - i);
            ans = ans / (i + 1);
        }
        return (int) ans;
    }
    public static void main(String[] args) {
        int n = 8, r = 2;
        nCr(n, r);
        System.out.println("nPr = " + nCr(n, r));
    }
}
