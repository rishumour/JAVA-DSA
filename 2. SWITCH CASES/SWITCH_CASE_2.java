import java.util.Scanner;

public class SWITCH_CASE_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter operator (+, -, *, /): ");
        char op = sc.next().charAt(0);
        
        System.out.print("Enter two numbers: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        
        switch (op) {
            case '+':
                System.out.println("Result: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Result: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        
        sc.close();
    }
}