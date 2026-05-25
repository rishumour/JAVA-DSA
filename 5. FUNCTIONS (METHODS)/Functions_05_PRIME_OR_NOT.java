public class Functions_05_PRIME_OR_NOT {
    
    public static boolean Prime(int n) {
        
        boolean isPrime = true;
        
        for (int i = 2; i < n - 1; i++) { // int i = 2 because 1 is already a prime number so there is no point checking it
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }

    public static void main(String[] args) {
               
        if (Prime(5) == true) {
            System.out.println("prime Number");
        } else {
            System.out.println("not a prime number");
        }
    }
}
