// Converts a binary number to its decimal equivalent

public class Functions_14_BINARY_TO_DECIMAL {

    public static int decimalValue(int binNum) {
        int ans = 0;
        int pow = 1;
        int rem;

        
        while (binNum > 0) {       // Loop continues until all digits of the binary number are processed
            rem = binNum % 2;      // Get the last digit of the binary number
            ans += (rem * pow);    // Add the digit's value multiplied by its positional weight (power of 2)
            binNum /= 10;          // Remove the last digit from the binary number by dividing by 10
            pow *= 2;              // Move to the next power of 2 (1, 2, 4, 8, 16, etc.) for the next position
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int n = 10001;
        System.out.println("Decimal Value of " + n + " is = " + decimalValue(n));
    }
}