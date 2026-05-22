public class GreatestCommonDivider {

    public static void main(String[] args) {
        int num1 = 20;
        int num2 = 30;

        int GCD = 1;

        for (int i = 1; i <= Math.min(num1, num2); i++) { // iteration from 1 to min of num1 and num2
            if (num1 % i == 0 && num2 % i == 0) { // checking if both the numbers give remainder = 0 when divide with each iteration of i
                GCD = i;
            }
        }
        System.out.println(GCD);
    }
}
 // GCD = Highest Common factor