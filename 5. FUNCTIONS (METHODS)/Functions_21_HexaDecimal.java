import java.util.Scanner;
public class Functions_21_HexaDecimal {
    public  static String decimalTOHexa(int n ){
        if (n == 0) return "0";
        String digits = "0123456789ABCDEF";
        String res = "";
        while(n > 0){
            int rem = n % 16;
            n /= 16;
            res += digits.charAt(rem);
        }
        String rev = "";
        for (int i = res.length() - 1; i >= 0; i--){
            rev += res.charAt(i);
        }
        return rev;
    }    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        decimalTOHexa(n);
        sc.close();
    }
}
