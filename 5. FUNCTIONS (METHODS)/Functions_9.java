// Calculates the sum of all integers from 1 up to 'n'

public class Functions_9 {
        
    public static int sumN(int n) {
        int sum = 0;
        
        
        
        for (int i = 1; i <= n; i++) { // Loop starts at 1 and runs until 'i' is greater than 'n'
            sum += i;
        }
        
        return sum;
    }

    public static void main(String[] args) {
        
        int a = 5, b = 10;

        System.out.println("Sum = " + sumN(a));
        System.out.println("Sum = " + sumN(b));
    }
}