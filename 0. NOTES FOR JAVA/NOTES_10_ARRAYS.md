# 1 Array Basics & Declaration

    -> Definition: An array is a fixed-size, homogeneous data structure that stores elements of the same data type in contiguous memory locations.

    -> Index-Based: Elements are accessed using a 0-based index. The first element is at 0, and the last is at length - 1.

    -> Declaration & Instantiation: ```java
        int[] arr = new int[5]; // Declares and allocates memory for 5 integers (defaulted to 0)
        int[] inlineArr = {10, 20, 30, 40, 50}; // Literal initialization
    
    -> The length Property: Every array has a built-in, read-only property to find its size: arr.length.

__________________________________________________________________________________________________________________________________________________________________

# 2. Accessing & Modifying Elements


    -> Accessing: Retrieve a value using its index.
        int firstElement = arr[0];

    -> Modifying: Assign a new value directly to a specific index.
        arr[2] = 99; // Changes the 3rd element to 99

    ->Boundary Exception: Accessing an index outside [0, length - 1] throws an ArrayIndexOutOfBoundsException.

__________________________________________________________________________________________________________________________________________________________________

# 3. Traversing Arrays (Looping)
    
    -> For Loop (Index-based): Best when you need the index or want to modify elements.
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    -> Enhanced For Loop (For-each): Cleaner syntax, used for read-only traversal. You cannot modify array elements using this loop.
        for (int num : arr) {
            System.out.println(num);
        }    

__________________________________________________________________________________________________________________________________________________________________

# 4. Common Array Operations

    -> Because native arrays have a fixed size, operations like insertion and deletion require manual shifting or creating a new array.

        -> Searching:
            Linear Search: Check every element sequentially (O(n) time).
            Binary Search: Efficiently search a sorted array by repeatedly dividing the search interval in half (O(\log n) time).

        -> Insertion: To insert an element, you must shift subsequent elements to the right to make room (or create a larger array if it's full).

        -> Deletion: To remove an element, you delete it and shift subsequent elements to the left to close the gap.

        -> Reversing: Swap the first and last elements, move inward towards the center, and repeat until they meet.

__________________________________________________________________________________________________________________________________________________________________

# 5. The java.util.Arrays Utility Class

    -> Java provides a built-in utility class with highly optimized, ready-to-use methods for common operations:
        
        -> Arrays.toString(arr): Converts the array into a readable string format (e.g., [1, 2, 3]).

        -> Arrays.sort(arr): Sorts the array in ascending order (uses Dual-Pivot Quicksort, O(n \log n) time).

        -> Arrays.binarySearch(arr, key): Searches for a key in a sorted array; returns the index if found.

        -> Arrays.equals(arr1, arr2): Checks if two arrays have the same length and identical elements in the same order.

        -> Arrays.fill(arr, value): Fills the entire array with a specified value.

        -> Arrays.copyOf(arr, newLength): Copies the array into a new array, truncating or padding with defaults to match the newLength.

__________________________________________________________________________________________________________________________________________________________________

# 6. Multidimensional Arrays (Arrays of Arrays)

    -> Definition: In Java, a 2D array is essentially an array where each element is itself another array.

    -> Declaration & Initialization:
        int[][] matrix = new int[3][4]; // 3 rows, 4 columns
        int[][] literalMatrix = { {1, 2}, {3, 4}, {5, 6} };

    -> Jagged Arrays: Because they are arrays of arrays, rows can have different lengths.
        int[][] jagged = new int[2][];
        jagged[0] = new int[3]; // Row 0 has 3 columns
        jagged[1] = new int[5]; // Row 1 has 5 columns
    
    -> Traversing 2D Arrays: Requires nested loops.
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }
__________________________________________________________________________________________________________________________________________________________________

# 7. Memory Management & Limitations

    -> Heap Allocation: Arrays are treated as objects in Java. They are always allocated on the heap, and the array variable holds a reference to that memory location.

    -> Fixed Size Limitation: Once created, an array's size cannot change. If you need dynamic sizing, you must use ArrayList.

    -> Type Rigidity: You cannot store a String in an int[] array. It is enforced strictly at compile-time.