public class Functions_18_LAST_SECOND_EVENODD {
    public static boolean isEvenOdd(int n){
        if(n < 10){
            return false;
        }
        n /= 10;
        return (n % 10) % 2 == 0;
    }

    public static void main(String[] args) {
        int n = 15;
        System.out.println(isEvenOdd(n));
    }

}
