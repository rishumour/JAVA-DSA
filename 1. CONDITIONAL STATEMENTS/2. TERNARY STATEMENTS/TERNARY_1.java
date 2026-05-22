import java.util.Scanner;

public class TERNARY_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        System.out.println(n >= 0 ? "positive" : "negative");
        
        sc.close();
    }
}