
public class Palindrome {

    public static void main() {
        int rev = 0, rem;
        int n = 121;
        int original = n;

        while (n > 0) {
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        if (rev == original) {
            System.out.println("Is Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}