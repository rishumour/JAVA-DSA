public class Reverse{
    public static void main(){
        int rev = 0, rem;
        int n = 123;

        while (n > 0){
            rem = n % 10;
            rev = rev * 10 + rem;
            n /= 10;
        }
        System.out.println(rev); 
    }
}