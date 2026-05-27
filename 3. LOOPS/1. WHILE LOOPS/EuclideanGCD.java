// GCD stands for greatest common divisor aka HCF highest common factor

import java.util.Scanner;

public class EuclideanGCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Max: ");
        int max = sc.nextInt();
        System.out.println("Enter Min:");
        int min = sc.nextInt();
        sc.close();
        while (min != 0){
            int rem = max % min;
            max = min;
            min = rem;
        }
        System.out.println(max);
        sc.close();
    }
}