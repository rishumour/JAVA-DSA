import java.util.Scanner;

public class Pattern_10_STAIRS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of steps: ");
        int n = sc.nextInt();

        System.out.print("Enter height of step: ");
        int m = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int h = 0; h < m; h++) {
                for (int j = 1; j <= i * m + 1; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}