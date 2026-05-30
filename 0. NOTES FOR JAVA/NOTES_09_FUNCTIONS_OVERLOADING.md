Function (Method) Overloading
*****************************

Q: What is Method Overloading in Java?
=> Method overloading is a feature that allows a class to have more than one method with the exact same name, as long as their parameter lists (signatures) are different. It is a core pillar of Object-Oriented Programming representing Compile-Time (or Static) Polymorphism.

Q: Why do we use method overloading instead of giving methods different names?
=> It majorly increases code readability and consistency. Instead of inventing different names for the same action applied to different data types (e.g., printInt(), printString(), printDouble()), we simply use a single, clean method name: print().

______________________________________________________________________________________________________________________________

Rules for Overloading
*********************

Q: What constitutes a unique method signature for overloading?
=>  The compiler distinguishes methods based on their argument lists. To successfully overload a method, you must change at least one of the following:

    -> The number of parameters: add(int a, int b) vs add(int a, int b, int c)

    -> The data types of parameters: add(int a, int b) vs add(double a, double b)

    -> The sequence of data types: display(int a, String b) vs display(String a, int b)

Q: Can we overload a method by changing only its return type or access modifier?
=> No. Changing just the return type (e.g., changing void to int) or changing the access modifier (e.g., public to private) will cause a compile-time error. The JVM would have no way to know which method to invoke if you call it without assigning its output.

Example:

    // VALID OVERLOADING
    class Calculator {
        int multiply(int a, int b) { return a * b; }
        double multiply(double a, double b) { return a * b; } // Valid: different types
    }

    // INVALID OVERLOADING (Will cause compiler error)
    class Display {
        void show(int x) { ... }
        int show(int x) { return x; } // Invalid: compiler can't distinguish them by return type alone
    }
______________________________________________________________________________________________________________________________

Method Overloading Mechanics
****************************

1. The Compiler's Role (Static Binding)

When you compile your Java code, the compiler performs static binding. It looks at the arguments passed into the method call and matches them exactly to the correct method template in your class code.

2. Automatic Type PromotionQ: 

What happens if a method is called with a data type that doesn't have an exact matching overloaded signature?A: Java doesn't instantly crash; it attempts Automatic Type Promotion. It will automatically cast smaller data types to larger ones (e.g., byte $\rightarrow$ short $\rightarrow$ int $\rightarrow$ long $\rightarrow$ float $\rightarrow$ double) to find a matching method profile.

Example:

    class Demo {
        void check(long a) { System.out.println("Long method called"); }
        void check(double a) { System.out.println("Double method called"); }

        public static void main(String[] args) {
            Demo d = new Demo();
            d.check(5); // 5 is an 'int'. Since check(int) doesn't exist, 'int' promotes to 'long'.
        }
    }

______________________________________________________________________________________________________________________________

Pros & Cons of Method Overloading
*********************************

=> Pros

    Clean API Design: Dramatically reduces the number of method names developers have to memorize to do similar tasks (e.g., Java's built-in System.out.println() handles integers, strings, and objects cleanly via overloading).

    Flexibility: Gives your programs the ability to handle varying inputs smoothly without forcing manual type conversion before invoking functions.

=> Cons

    Code Confusion: If overused or poorly designed (like altering the sequence of arguments subtly), it can lead to confusing code that makes it hard for other developers to tell which method runs at a glance.

    Type Promotion Bugs: Automatic type promotion can sometimes lead to unexpected method invocations if you aren't careful about how numeric boundaries align with your overloaded signatures.