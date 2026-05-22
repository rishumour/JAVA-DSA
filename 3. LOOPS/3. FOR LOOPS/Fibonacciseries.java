import java.util.Scanner;
public class Fibonacciseries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n= sc.nextInt();
        if (n == 0) {
            System.out.println(0);
        }
        if (n == 1){
            System.out.println(1);
        }
        int prev = 0;
        int next = 1;
        int sum = 0;
        for(int i = 2; i <= n; i++ ){
            sum = prev + next;
            prev = next;
            next = sum;
            System.out.println(sum);
        }        
    }
}
// fibonacci series means adding prev number with the next number 
// 0 1 2 3 4 5 => 0+1, 1+1, 2+1, 3+2, 5+3 ..... 