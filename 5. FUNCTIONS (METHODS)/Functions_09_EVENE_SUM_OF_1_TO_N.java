// Calculates the sum of all integers from 1 up to 'n'

public class Functions_09_EVENE_SUM_OF_1_TO_N {
        
    public static int sumN(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) { // Loop starts at 1 and runs until 'i' is greater than 'n'
            
            if (i % 2 == 0){
                sum += i;
            }
        }
        
        return sum;
    }

    public static void main(String[] args){
        int sum = sumN(2 , 10);
        System.out.println("Sum = " + sum);
    }
}