public class Arrays_07_DistancebetweenPositive {
    public static int distanceBetween(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
               
        while (start < n && (arr[start] <= 0 || arr[start] % 2 != 0)) { 
            start++;     // move start forward while the number is negative, zero, or odd
        }
        while (end >= 0 && (arr[end] <= 0 || arr[end] % 2 != 0)) { 
            end--;       // move end backward while the number is negative, zero, or odd
        }
        if (start < end) {  // if they haven't crossed each other and aren't pointing to the same element
            return end - start; // return index distance:
        }

        return -1; // if no such pair exists
    } 

    public static void main(String[] args) {
        int[] arr = { 1, 2, -1, 5, 6}; 
        System.out.println("Distance between 2 positive elements = " + distanceBetween(arr)); 
    }
}