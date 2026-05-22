import java.util.Scanner;

public class WHILE_LOOPS_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        if (n > 5) {
            System.out.println("invalid input");
        }

        int i = 1;
        while (i <= n){
            System.out.println("Hello USER...");
            i++;
        } 

        sc.close();
    }
}