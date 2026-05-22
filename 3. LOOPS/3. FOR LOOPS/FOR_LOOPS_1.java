// to find sum of square roots of digits

import java.util.Scanner;

public class FOR_LOOPS_1{
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = sc.nextInt();

      int i;
      for(i = 0; n > 0; n /= 10) {
         int rem = n % 10;
         i += rem * rem ;
      }

      System.out.println(i);
   }
}