import java.util.Scanner;

public class Pattern_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of steps: ");
        int steps = sc.nextInt();
        System.out.print("Enter height of step: ");
        int step_height = sc.nextInt();

        for (int i = 1; i <= steps; i++) {
            for (int h = 0; h < step_height; h++) {
                for (int j = 1; j <= i * step_height; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        sc.close();
    }
}