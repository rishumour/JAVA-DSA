import java.util.Scanner;
public class SWITCH_CASE_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch(x){
            case 1:
                System.out.println("HELLO");
                break;
            case 2:
                System.out.println("baby");
                break;
            case 3:
                System.out.println("don't");
                break;
            case 4:
                System.out.println("die");
                break;
            default:
                System.out.println("please");
                break; // it is not needed to write break here but we write as a good programme.......
        }
        sc.close();
    }
}