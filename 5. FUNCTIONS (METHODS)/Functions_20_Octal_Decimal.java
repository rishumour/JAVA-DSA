public class Functions_20_Octal_Decimal {
    public static void main(){
        int binary = 1000100011;
        int decimal = 0;
        int octal = 0;
        int pow = 0;

        // Step 1: Binary to Decimal
        // *************************

        while (binary != 0) {
            int rem = binary % 10;
            decimal += rem * Math.pow(2, pow); // math.pow(2, i) meaning 2^i
            binary /= 10;
            pow++;
        }

        // Step 2: Decimal to Octal
        // ************************
        
        pow = 1;
        while (decimal != 0) {
            int rem = decimal % 8;
            octal += rem * pow;
            decimal /= 8;
            pow *= 10;
        }

        System.out.println("Octal Value: " + octal);
    }
}
