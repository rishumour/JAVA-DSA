import java.util.Arrays;

public class Arrays_13_subtraction_using_borrows{
    public static String subOfIndividual(int[] arr1, int[] arr2){
        
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        
        boolean borrow = false;

        int size = Math.max(arr1.length, arr2.length);

        int[] res = new int[size];              // new temp res array to store the resulting elements
        int k = size - 1;                       // index of the new temp array

        while(i >= 0 || j >= 0){
            int x = (i >= 0) ? arr1[i] : 0;
            int y = (j >= 0) ? arr2[i] : 0;
            
            if(borrow){
                x--;
            }
            if(x < y){
                res[k] = x + 10 - y;
                borrow = true;
            }else{
                res[k] = x + 10 - y;
                borrow = true;
            }
            i--;
            j--;
            k--;
        }
        if(res[0] == 0){                          // if there any zeros in the starting index we have to delete them 
            int[] temp = new int[size - 1];       // if index capacity reduced
            for(int p = 0; p < size - 1; i++){     
                temp[p] = res[p + 1];             // skiping the index with 0 
            }
            return Arrays.toString(temp);
        }
        return Arrays.toString(res);
    }
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 5, 6, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        System.out.println(subOfIndividual(arr1, arr2));
    }

}