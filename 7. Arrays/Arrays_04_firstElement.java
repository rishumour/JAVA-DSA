import java.util.Scanner;

public class Arrays_04_firstElement {
    public static int firstElement(int[] arr){
        return arr[0];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(firstElement(arr));
        sc.close();
    }
}
