import java.util.Scanner;

public class Functions_22_BaseConversion {
    

    // Function to convert any base number to decimal
    public static int toDecimal(String number, int currentBase) {

        int decimal = 0;
        int power = 1;

        // Traverse from right to left
        for (int i = number.length() - 1; i >= 0; i--) {

            char ch = number.charAt(i);

            int digit;

            // Convert character to integer value
            if (ch >= '0' && ch <= '9') {
                digit = ch - '0';
            } else {
                digit = ch - 'A' + 10;
            }

            decimal = decimal + (digit * power);

            power = power * currentBase;
        }

        return decimal;
    }

    
    public static String fromDecimal(int decimal, int targetBase) {
        if (decimal == 0) {
            return "0";
        }
        String result = "";
        while (decimal > 0) {
            int remainder = decimal % targetBase;

            // Convert remainder to character
            if (remainder < 10) {
                result = remainder + result;
            } else {
                result = (char)(remainder - 10 + 'A') + result;
            }
            decimal = decimal / targetBase;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        String number = sc.nextLine().toUpperCase();

        System.out.print("Enter current base: ");
        int currentBase = sc.nextInt();

        System.out.print("Enter target base: ");
        int targetBase = sc.nextInt();

        // Step 1: Convert to decimal
        int decimal = toDecimal(number, currentBase);

        // Step 2: Convert decimal to target base
        String result = fromDecimal(decimal, targetBase);

        System.out.println("Converted number: " + result);

        sc.close();
    }
}