// import java.util.Scanner;
public class Perfectsqr {
    public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
      int high = 50;
      int low = 10;
      for(int i = 1; i < high; i++) {
        int sqr = i*i;
         if (sqr >= low && sqr <= high){
            System.out.println(sqr);
         }
         if (sqr > high){
            break;
         }
      }
   }
}