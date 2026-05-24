 // Compares two integers and returns the smaller one

public class Functions_8 {
    
    public static int minNum(int a, int b) {
        if (a < b) {
            return a;
        } else {
            return b;
        }
    }

    
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("min = " + minNum(a, b));
    }
}