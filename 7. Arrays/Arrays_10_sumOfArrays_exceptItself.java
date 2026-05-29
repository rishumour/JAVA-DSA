public class Arrays_10_sumOfArrays_exceptItself {
    
    public static int sumOfArray(int[] arr){
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        for (int i = 0; i < arr.length; i++){
            arr[i] = sum - arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6};
        System.out.println(sumOfArray(arr));
    }
}
