# Types of Scope in Java

Q: What does "scope" mean in Java?
=> Scope refers to the visibility and lifetime of a variable within a program. It determines which parts of your code can access or modify a specific variable, and where that variable is automatically destroyed to free up memory.

Q: What are the four primary scopes in Java?
=>  1.  Class Scope (Static Variables)
    2.  Instance Scope (Object Variables)
    3.  Method Scope (Local Variables)
    4.  Block Scope (Loop/Conditional Variables)

______________________________________________________________________________________________________________________________

# Detailed Breakdown of Scopes

1. Class Scope (Static Variables)

    Where it's declared: Inside a class, outside any method, with the static keyword.

    Visibility: Accessible by all methods and instances of that class. Can even be accessed without creating an object by using ClassName.variableName.

    Lifetime: Lives as long as the application is running (loaded into memory once when the class is loaded).

2. Instance Scope (Member Variables)

    Where it's declared: Inside a class, outside any method, without the static keyword.

    Visibility: Accessible by any non-static method within that class. Each object created gets its own unique copy.

    Lifetime: Born when an object is created via new, and dies when that object is garbage collected.

3. Method Scope (Local Variables)

    Where it's declared: Inside a method body or as a method parameter.

    Visibility: Only visible inside that specific method. Other methods in the same class have no idea it exists.

    Lifetime: Created when the method is invoked and instantly destroyed when the method exits.

4. Block Scope (Loop/Conditional Variables)

    Where it's declared: Inside a specific set of curly braces {} within a method (like an if statement or a for loop).

    Visibility: Strictly isolated to that specific block.

    Lifetime: Destroyed the moment execution leaves the closing brace.

Example:

        public class ScopeDemo {
            static int classVar = 10;  // 1. Class Scope
            int instanceVar = 20;      // 2. Instance Scope

            void myMethod(int parameterVar) { // 3. Method Scope (parameterVar)
                int localVar = 30;            // 3. Method Scope (localVar)

                if (localVar > 10) {
                    int blockVar = 40;        // 4. Block Scope
                    System.out.println(blockVar);
                }
                // blockVar is destroyed here; cannot be used anymore.
            }
        }

______________________________________________________________________________________________________________________________

# This keyword


Q: What is the this keyword in Java?
=> In Java, this is a reference variable that points directly to the current object instance executing the code. It is used inside instance methods or constructors to clear up ambiguity and pass object references.

Q: What are the primary use cases of this?
=> There are three major scenarios where this is heavily used:
    1. Resolving Variable Shadowing (Most Common)

    2. When a method or constructor parameter has the exact same name as an instance variable, the local parameter "shadows" (hides) the instance variable. this is used to explicitly tell the compiler you want to target the instance variable.

Example:

    public class Student {
        private String name; // Instance variable

        // Constructor parameters share the name "name"
        public Student(String name) {
            this.name = name; // "this.name" means the instance variable; "name" means the parameter
        }
    }