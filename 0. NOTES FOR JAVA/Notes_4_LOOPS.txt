Introduction to Loops
*********************

Q: What is a loop in Java?
=> A loop is a control flow statement that repeatedly executes a block of code as long as a specified boolean condition remains true. Loops are fundamental for iterating through data structures and automating repetitive tasks.

Q: What are the three essential components of a loop control mechanism?
=>  Initialization: Setting up the starting loop counter variable.

    Condition: The boolean expression evaluated before or after each cycle to decide if the loop should continue.

    Update/Increment: Modifying the loop counter variable so the condition eventually evaluates to false (preventing an infinite loop).

______________________________________________________________________________________________________________________________

Types of Loops in Java
**********************

Java provides four primary loop structures, categorized into entry-controlled and exit-controlled loops.


1. The for Loop (Entry Controlled)

Q: When should you use a standard for loop?
=> Use a standard for loop when the exact number of iterations is known beforehand. It bundles initialization, condition, and increment expression neatly onto a single line.

        // Syntax: for (initialization; condition; update)
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteration: " + i);
        }

2. The Enhanced for Loop / For-Each (Entry-Controlled)

Q: What is the enhanced for loop and what are its constraints?
=> Introduced in Java 5, it provides a simpler way to iterate strictly forward through arrays or collections sequentially without using an explicit index counter.

    Constraint: It is read-only; you cannot use it to modify array elements or access specific index positions.

        int[] numbers = {10, 20, 30};
        for (int num : numbers) {
            System.out.println(num); // Prints each number
        }

3. The while Loop (Entry-Controlled)

Q: When is a while loop preferred over a for loop?
A: Use a while loop when the number of iterations is not known in advance, and the loop depends purely on a condition changing dynamically during execution (e.g., reading lines from a file until reaching the end).

        int count = 1;
        while (count <= 3) {
            System.out.println(count);
            count++; // If omitted, creates an infinite loop
        }

4. The do-while Loop (Exit-Controlled)

Q: What makes the do-while loop unique?
=> It is an exit-controlled loop, meaning the code block executes at least once before the condition is ever tested. The condition is checked at the bottom of the loop.

        int internalSignal = 0;
        do {
            System.out.println("This prints exactly once.");
        } while (internalSignal > 0);

______________________________________________________________________________________________________________________________

Loop Control Statements
***********************

Q: What is the difference between break and continue inside loops?
=>  break: Instantly terminates the loop entirely and transfers control to the next line of code outside the loop structure.

    continue: Skips the remaining code in the current iteration and jumps directly to the next cycle evaluation (the update step in a for loop, or the condition step in a while loop).

Q: Does Java support labeled loops?
=> Yes. Java allows you to add a custom label name followed by a colon before a loop structure. This allows an inner nested loop to break or continue a specific outer loop directly.

        outerLoop: 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 1 && j == 1) {
                    break outerLoop; // Terminates the entire outer loop
                }
            }
        }
