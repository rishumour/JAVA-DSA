import java.util.Scanner;

public class CS_3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = sc.nextInt();
        
        if (marks >= 90) {
            System.out.println("Grade A");
        } else if (marks >= 80) {
            System.out.println("Grade B");
        } else if (marks >= 50) {
            System.out.println("Grade C");
        } else if (marks >= 35) {
            System.out.println("Just Passed");
        } else {
            System.out.println("Failed....");
        }
        
        sc.close();
    }
}