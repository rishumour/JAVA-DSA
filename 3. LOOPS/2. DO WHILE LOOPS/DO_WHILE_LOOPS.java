import java.util.Scanner;

public class DO_WHILE_LOOPS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        if (n > 5) {
            System.out.println("invalid input");
        }

        int i = 1;
        do {
            System.out.println(i + " ");
            i++;
        } while (i <= n);

        sc.close();
    }
}