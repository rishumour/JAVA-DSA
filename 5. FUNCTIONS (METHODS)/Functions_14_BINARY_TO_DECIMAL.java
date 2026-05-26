// Converts a binary number to its decimal equivalent

public class Functions_14_BINARY_TO_DECIMAL {

    public static int decimalValue(int binNum) {
        int ans = 0;
        int pow = 1; // place vlaue basically power of one, tens and etc.....
        int rem;

        
        while (binNum > 0) {       // Loop continues until all digits of the binary number are processed
            rem = binNum % 10;      // Get the last digit (0 or 1) of the base-10 representation
            ans += (rem * pow);    // Add the digit's value multiplied by its positional weight (power of 2)
            binNum /= 10;          // Remove the last digit from the binary number by dividing by 10
            pow *= 2;              // Move to the next power of 2 (1, 2, 4, 8, 16, etc.) for the next position
        }
        // SIMPLER APPROACH USING STRING CONVERSION
        // ****************************************
        
        // String binStr = "101011"; // Binary for 43
    
        // int decimal = Integer.parseInt(binStr, 2); 
        
        // System.out.println("Decimal Value: " + decimal); // Outputs 43

        return ans;
    }

    public static void main(String[] args) {
        int n = 110;
        System.out.println("Decimal Value of " + n + " is = " + decimalValue(n));
    }
}

//Iteration 1: 1100100 % 10 gives 0. ans becomes $0 + (0 \times 1) = 0$. binNum becomes 110010. pow becomes 2.