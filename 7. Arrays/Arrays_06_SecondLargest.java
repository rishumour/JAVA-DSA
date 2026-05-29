public class Arrays_06_SecondLargest {
    public static int secondLargest(int[] arr){
        
        // checking the largest in the array just to compare and get second largest 
        int max = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        // checking if there is any repeating element and if there is then increase the count
        int count = 0;
        for(int i : arr){
            if(i == max){
                count ++;
            }
        }
        // checking if the count is = the length of array and if it so then it means all the elements in the array are same 
        if(count == arr.length){
            return -1;
            
        }
         
        // to find the the second largest
        int sec_max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > sec_max && i < max){
                sec_max = i;
            }
        }
        return sec_max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 35, 5, 4};
        System.out.println(secondLargest(arr));
    }
}
