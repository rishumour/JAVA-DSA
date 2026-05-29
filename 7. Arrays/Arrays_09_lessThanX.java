public class Arrays_09_lessThanX {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 5, 6};
        int count = 0;
        int x = 7;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < x){
                count ++;
            }
        }
        System.out.println(count);
    }
}
