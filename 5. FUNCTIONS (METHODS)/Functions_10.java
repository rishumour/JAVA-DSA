// Calculates the factorial of a number 'n'

public class Functions_10 {
    
    public static long factorialN(int n) {  // Returns a 'long' because factorials grow very quickly and can easily exceed standard integer limits
        long fact = 1; 
        
        for (int i = 1; i <= n; i++) { // Loop starts at 1 and runs until 'i' is greater than 'n'
            fact *= i;
        }
        
        return fact;
    }

    public static void main(String[] args) {

        int a = 5, b = 6;

        System.out.println("Factorial of " + a + " is = " + factorialN(a));
        System.out.println("Factorial of " + b + " is = " + factorialN(b));
    }
}