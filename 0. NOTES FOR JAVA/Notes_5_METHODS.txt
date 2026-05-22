Introduction to Methods (Functions)
***********************************

Q: What is a function in Java, and what is it called?
=> In Java, functions are called methods. A method is a structured block of code that only runs when it is explicitly called. Because Java is an entirely class-based language, every method must be defined inside a class, unlike pure functional or procedural languages.

Q: What is the anatomy of a Java method declaration?
=> A standard Java method signature consists of six parts:

public static   int    sum  (int a, int b) { ... }
   │       │      │      │        │
   │       │      │      │        └─► Parameters (Inputs)
   │       │      │      └──────────► Method Name
   │       │      └─────────────────► Return Type (Output)
   │       └────────────────────────► Modifiers (static, final, etc.)
   └────────────────────────────────► Access Specifier (public, private)

______________________________________________________________________________________________________________________________

Key Concepts & Syntax
*********************

1. Return Types & Parameters

Q: What is the void keyword?
=> void is a special return type specifying that the method executes a task but does not return any data value back to the code that called it.

Q: What is the difference between Parameters and Arguments?
=>  Parameters: The variables declared in the method definition (the blueprint).

    Arguments: The actual values passed into the method when it is invoked.

2. Memory Mechanics: Value vs Reference

Q: Does Java pass arguments by value or by reference?
=>  Java is strictly Pass-by-Value.

    When passing a primitive, a copy of the actual bits is passed. Modifying it inside the method leaves the original variable untouched.

    When passing an object, a copy of the memory address reference is passed by value. This means modifying the inner fields of the object alters the original object, but assigning the variable to a entirely new object inside the method does not change the original pointer.

3. Method Overloading

Q: What is Method Overloading?
=> Method overloading allows a class to have multiple methods with the exact same name, provided their parameter lists are different (either by number of parameters, types of parameters, or sequence of parameters). It is a form of compile-time polymorphism.

Note: Changing only the return type or the access modifier does not qualify as overloading and will trigger a compiler error

        int add(int a, int b) { return a + b; }
        double add(double a, double b) { return a + b; } // Overloaded version

4. Static vs Instance Methods

Q: What is the difference between a static method and an instance method?
=>  Static Methods: Declared with the static keyword. They belong to the class itself and can be called directly without  creating an object instance (e.g., Math.sqrt()). They cannot access non-static instance fields.

    Instance Methods: Do not use static. They belong to individual objects of the class and can only be invoked after an object is instantiated using the new keyword.
    
    