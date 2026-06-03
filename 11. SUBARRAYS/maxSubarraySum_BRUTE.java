public class maxSubarraySum_BRUTE {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1, 2, 3, 4, 5};

        int maxSum = Integer.MIN_VALUE;

        for (int start = 0; start < n; start++) {
            int currSum = 0;
            for (int end = start; end < n; end++) {
                currSum += arr[end];
                maxSum = Math.max(currSum, maxSum);
            }
        }
        
        System.out.println("max subarray sum = " + maxSum);
    }
}