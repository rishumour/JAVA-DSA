import java.util.Scanner;

public class Arrays_03_LinearSearch {
    public static boolean linearSearch(int [] arr, int size, int target){
        for (int i = 0; i < size; i++){
            if (arr[i] == target){
                return true;
            }
        }

        return false;
    }
    public static int linearSearchVal(int [] arr, int size, int target){
        for (int i = 0; i < size; i++){
            if (arr[i] == target){
                return i;
            }
        }
        return -1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];

        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(linearSearch(arr, size, target));        
        System.out.println(linearSearchVal(arr, size, target));
        sc.close();
     }
}
