import java.util.Arrays;

public class Arrays_11_substraction {

    public static String subtractArrays(int[] arr1, int[] arr2) {
        
        int maxLength = Math.max(arr1.length, arr2.length); // the result array must be the size of the larger input array
        
        int[] result = new int[maxLength]; // new array with new length

        for (int i = 0; i < maxLength; i++) {
            int element1 = 0;
            int element2 = 0;

            if(i < arr1.length){// if index exists in arr1, use its value; otherwise use 0
                element1 = arr1[i];
            } 
            if(i < arr2.length){// if index exists in arr2, use its value; otherwise use 0
                element2 = arr2[i];
            }
            result[i] = element1 - element2;
        }

        return Arrays.toString(result);
    }
    public static void main(String[] args) {
        
        int[] arr1 = {2, 4, 6, 8, 10};
        int[] arr2 = {1, 2, 4, 7};
        
        System.out.println("Difference = " + subtractArrays(arr1, arr2) );
    }
}