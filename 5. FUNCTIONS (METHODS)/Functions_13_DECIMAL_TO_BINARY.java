// Converts a decimal number into its binary representation

public class Functions_13_DECIMAL_TO_BINARY {
    
    
    public static int binaryValue(int decimal) {
        int ans = 0;
        int pow = 1;
        int rem;

        
        while (decimal > 0) {       // Loop continues until the decimal number is reduced to 0
            rem = decimal % 2;      // Get the remainder when dividing by 2 (this gives the current binary digit: 0 or 1)
            decimal = decimal / 2;  // Divide the decimal number by 2 to process the next bit
            ans += (rem * pow);     // Add the binary digit to the correct place value in the final answer
            pow = pow * 10;         // Multiply power by 10 to shift to the next position (ones, tens, hundreds, etc.)
        }
        
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("Binary Value = " + binaryValue(42));
    }
}