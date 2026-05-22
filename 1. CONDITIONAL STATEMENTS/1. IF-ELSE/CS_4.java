import java.util.Scanner;

public class CS_4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter character: ");
        
        char ch = sc.next().charAt(0);
        
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("lowercase");
        } else {
            System.out.println("UPPERCASE");
        }
        
        sc.close();
    }
}