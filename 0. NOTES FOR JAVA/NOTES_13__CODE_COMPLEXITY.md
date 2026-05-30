Code Complexity
***************

Q: What is code complexity in programming?
=> Code complexity refers to the measurement of resources—specifically time (CPU execution operations) and space (RAM memory allocation)—that an algorithm consumes as the size of the input data scales upward.

Q: How is complexity formally measured?
=> It is measured using Big O Notation (O). Big O mathematically describes the upper bound of an algorithm's growth rate, focusing strictly on the worst-case scenario as the input size (n) approaches infinity. It ignores constant factors and lower-order terms (e.g., an algorithm requiring 3n2+5n+10 operations simplifies down to O(n2)).

__________________________________________________________________________________________________________________________________________________________________

Types of Time Complexity
************************

=> the most common time complexities encountered in programming, ranked from fastest to slowest.


1. Constant Time: O(1)
----------------------

=> The execution time remains completely identical, regardless of whether the input size is 10 or 10 million elements.
 
    -> Example: Accessing a specific index in an array.
    
    ->      int getFirstElement(int[] arr) {
                return arr[0]; // Always takes 1 step
            }

2. Logarithmic Time: O(logn)
----------------------------

=> The execution steps are cut in half with every single iteration. Algorithms with this complexity scale exceptionally well to massive datasets.

    -> Example: Binary Search on a sorted array.

    ->  int binarySearch(int[] arr, int target) {
            
            int low = 0, high = arr.length - 1;
            while (low <= high) {
            
                int mid = low + (high - low) / 2;
                if (arr[mid] == target) return mid;
                if (arr[mid] < target) low = mid + 1;
                else high = mid - 1;
            }
            return -1;
        }

3. Linear Time: O(n)
--------------------

=> The execution steps grow in direct, 1-to-1 proportion with the input size n. If the array doubles in size, the time taken doubles.

    -> Example: Traversal or Linear Search through an array.

    ->  void printAllElements(int[] arr) {
            for (int num : arr) {
                System.out.println(num); // Runs exactly 'n' times
            }
        }

4. Linearithmic Time: O(nlogn)
------------------------------

=> Occurs when an algorithm performs a logarithmic operation (O(logn)) nested inside a linear loop (O(n)). This is typical for highly efficient sorting algorithms.

    -> Example: Built-in Java sorting algorithms (Arrays.sort()), Merge Sort, and Quick Sort.
     
5. Quadratic Time: O(n2)
------------------------

=> The execution steps grow exponentially relative to the input data. If n=10, it takes 100 operations. If n=100, it takes 10,000 operations.

    -> Example: Nested loops scanning the same dataset (like Bubble Sort or finding duplicates via brute force).
    
    ->  void printAllPairs(int[] arr) {
            for (int i = 0; i < arr.length; i++) {       // Runs n times
                for (int j = 0; j < arr.length; j++) {   // Runs n times for each i
                    System.out.println(arr[i] + ", " + arr[j]);
                }
            }
        }

__________________________________________________________________________________________________________________________________________________________________

Time vs. Space Complexity
*************************

Q: What is Space Complexity?
=> While Time Complexity counts execution steps, Space Complexity measures the amount of extra memory allocation an algorithm requires relative to the input size n.

    -> O(1) Space (Constant): The algorithm uses a fixed amount of memory variables regardless of input size.

    -> O(n) Space (Linear): The algorithm instantiates new structures (like arrays or lists) that dynamically grow larger based on the size of the incoming data.

    ->  // O(1) Space Example: Reuses a single variable 'sum'
        int calculateSum(int[] arr) {
            int sum = 0; 
            for (int num : arr) sum += num;
            return sum;
        }

        // O(n) Space Example: Allocates a completely new array matching size n
        int[] copyArray(int[] arr) {
            int[] newArr = new int[arr.length]; // Consumes 'n' extra memory blocks
            for (int i = 0; i < arr.length; i++) newArr[i] = arr[i];
            return newArr;
        }
        