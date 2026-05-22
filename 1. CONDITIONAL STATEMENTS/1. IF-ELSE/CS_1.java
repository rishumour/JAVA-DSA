import java.util.Scanner;

public class CS_1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        if (n >= 0) {
            System.out.println("N is positive");
        } else {
            System.out.println("N is Negative");
        }
        
        sc.close();
    }
}