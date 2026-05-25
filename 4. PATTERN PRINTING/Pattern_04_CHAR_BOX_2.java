import java.util.Scanner;

public class Pattern_04_CHAR_BOX_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
        sc.close();
    }
}