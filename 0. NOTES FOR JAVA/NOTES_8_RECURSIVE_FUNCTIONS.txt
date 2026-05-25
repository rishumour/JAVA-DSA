Recursive Functions
*******************

Q: What is a recursive function (method) in Java?A: 
=> recursive function is a method that solves a problem by calling itself, directly or indirectly. It breaks a complex problem down into smaller, identical sub-problems until it reaches a point where the problem can be solved without further recursion.

Q: What are the two mandatory components of any valid recursive method?
=>  1.  Base Case: The termination condition that stops the recursion. Without it, the method would call itself indefinitely.
    2.  Recursive Case: The logical part of the method where it calls itself with a modified, smaller argument, moving closer to the base case.

Example:

    // Standard factorial recursion example
    public int factorial(int n) {
        if (n <= 1) {             // 1. Base Case
            return 1;
        }
        return n * factorial(n - 1); // 2. Recursive Case
    }
______________________________________________________________________________________________________________________________

Memory Mechanics of Recursion
*****************************

Q: How does the JVM handle recursive calls under the hood?
=>  Java utilizes Stack Memory to manage recursion. Every time a recursive method calls itself, the JVM pauses the current execution and pushes a fresh Stack Frame containing the method's local variables and parameters onto the Call Stack.

These frames pile up sequentially until the base case is finally reached. Once triggered, the stack begins unwinding: frames are popped off top-to-bottom as values return to their prior callers.
______________________________________________________________________________________________________________________________

Common Implementation Mistakes
******************************

Q: What is a Stack Overflow in recursion?
=> If a recursive method lacks a base case, or if its arguments fail to progress toward the base case, the Call Stack will run out of configured memory room. The JVM will immediately halt execution and throw a java.lang.StackOverflowError.

Q: Does Java support Automatic Tail-Call Optimization (TCO)?
=> No. Some functional programming languages optimize "tail-recursive" functions to prevent stack accumulation. The standard Java compiler does not do this; every single recursive step creates a physical stack frame regardless of how the code is structured.
______________________________________________________________________________________________________________________________

Pros & Cons of Recursive Functions
**********************************

=> Pros

    Algorithmic Elegance: Drastically simplifies code for complex tree-based or graph-based operations (like traversing a filesystem directory, DOM trees, or executing Binary Tree searches).

    Divide-and-Conquer Friendly: Perfect for natural multi-step sorting and searching algorithms like Merge Sort, Quick Sort, and the Tower of Hanoi.

=> Cons

    Memory Inefficiency: Risk of running out of stack space if processing deep iterations (e.g., trying to calculate a large Fibonacci number recursively).

    Performance Overhead: The continuous process of allocating and deallocating system stack frames makes recursion slower than standard hardware-level loops.