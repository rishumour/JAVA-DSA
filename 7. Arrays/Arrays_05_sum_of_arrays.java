import java.util.*;

public class Arrays_05_sum_of_arrays {
  static int[] calSum(int a[], int b[], int n, int m) {
      
    // 1. Determine the maximum possible length of the resulting number.
      int size = Math.max(n, m);
      
      // 2. Create a temporary array to hold the sum. 
      // We add +1 to the size to accommodate a potential final carry-over 
      // (e.g., [9,9] + [1] = [1,0,0]).
      int[] temp = new int[size + 1];
      
      // 3. Set up pointers to start from the end (least significant digits) 
      // of both input arrays and the temporary result array.
      int i = n - 1;
      int j = m - 1;
      int k = size; 
      
      int carry = 0;
      
      // 4. Loop until both input arrays are exhausted AND no carry remains.
      while (i >= 0 || j >= 0 || carry > 0){
          // Get the current digits. If a pointer goes below 0, use 0.
          // (Fixed the syntax error here: replaced '=' with ':')
          int x = (i >= 0) ? a[i] : 0; 
          int y = (j >= 0) ? b[j] : 0; 
          
          // Add the digits along with any carry from the previous column.
          int sum = x + y + carry;
          
          // The digit to store is the remainder when divided by 10 (e.g., 15 % 10 = 5).
          temp[k] = sum % 10;
          
          // The new carry is the quotient (e.g., 15 / 10 = 1).
          carry = sum / 10;
          
          // Move all pointers one step to the left for the next iteration.
          i--;
          j--;
          k--;
      }
      
      // 5. Clean up leading zeros. 
      // If the very first digit of our temp array is 0, it means the addition 
      // didn't create a new highest place value (e.g., no final carry).
      if(temp[0] == 0){
          // Create a perfectly sized array and copy everything over, 
          // skipping that initial zero.
          int[] ans = new int[size];
          for(int p = 0; p < size; p++){
              ans[p] = temp[p + 1];
          }
          return ans;
      }
      
      // If temp[0] is not 0, the number expanded (like 99 + 1 = 100), 
      // so we return the full temp array.
      return temp;
  }

  /* Driver program to test above function */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    // Read the first array's size and elements
    int n1 = sc.nextInt();
    int[] arr1 = new int[n1];
    for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

    // Read the second array's size and elements
    int n2 = sc.nextInt();
    int[] arr2 = new int[n2];
    for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
    sc.close();

    // Calculate and print the result, one digit per line
    int[] res = calSum(arr1, arr2, n1, n2);
    for (int i : res) System.out.println(i);
  }
}