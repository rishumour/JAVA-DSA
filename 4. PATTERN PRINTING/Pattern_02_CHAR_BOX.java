import java.util.Scanner;

public class Pattern_02_CHAR_BOX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        for (int i = 1; i <= n; i++) {
            char ch = 'A';
            for (int j = 1; j <= n; j++) {
                System.out.print("A ");
                ch = (char) (ch + 1);
            }
            System.out.println();
        }
        
        sc.close();
    }
}