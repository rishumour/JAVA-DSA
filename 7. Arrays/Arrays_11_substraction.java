import java.util.Arrays;

public class Arrays_11_substraction {

    public static String subtractArrays(int[] arr1, int[] arr2) {
        
        int maxLength = Math.max(arr1.length, arr2.length); // the result array must be the size of the larger input array
        int[] result = new int[maxLength]; // new array with new length

        for (int i = 0; i < maxLength; i++) {
            int val1 = 0;
            int val2 = 0;

            if(i < arr1.length){// if index exists in arr1, use its value; otherwise use 0
                val1 = arr1[i];
            } 
            if(i < arr2.length){// if index exists in arr2, use its value; otherwise use 0
                val2 = arr2[i];
            }
            result[i] = val1 - val2;
        }

        return Arrays.toString(result);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println("Difference = " + subtractArrays(arr1, arr2) );
    }
}