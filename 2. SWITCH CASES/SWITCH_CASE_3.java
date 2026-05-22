//  What and why ?
// 
// What > A switch statement is used to select one block of code from multiple
// options.

public class SWITCH_CASE_3 {

    public static void main(String[] args) {
        int a = 2;
        switch (a) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}