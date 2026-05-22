Variables in Java
*****************

Q: What is a variable in Java?
=> A variable is a container or a named memory location used to store data values during the execution of a Java program. Because Java is statically typed, every variable must be declared with a specific data type before it can be used.

Q: What are the three types of variables in Java based on their scope?
=>

    Local Variables: Declared inside a method, constructor, or block. They are only accessible within that specific block and must be initialized before use.

    Instance Variables: Declared inside a class but outside any method. They belong to an instance (object) of the class and have default values if not explicitly initialized.

    Static (Class) Variables: Declared with the static keyword inside a class. Only one copy exists for the entire class, shared across all objects of that class.


______________________________________________________________________________________________________________________________

Data Types in Java
******************

Q: How are data types categorized in Java?
=> Java categorizes data types into two distinct groups: Primitive Data Types and Non-Primitive (Reference) Data Types.

Data Types in Java
                       │
         ┌─────────────┴─────────────┐
         ▼                           ▼
   Primitive                     Non-Primitive
 (Built-in, holds              (User-defined, holds
   raw values)                   memory references)
     │                             │
     ├─► Numeric (byte, short,     ├─► Strings
     │            int, long)       ├─► Arrays
     ├─► Floating (float, double)  ├─► Classes
     ├─► Character (char)          └─► Interfaces
     └─► Logical (boolean)


______________________________________________________________________________________________________________________________


Pros & Cons of Java's Data Type System
**************************************

Pros

    Type Safety: Statically typed variables prevent type mismatch bugs at compile time (e.g., trying to save text inside an integer variable).

    Memory Efficiency: Built-in primitives use fixed, predictable chunks of memory, which allows for fast mathematical computations.

Cons

    Rigidity: You cannot easily change a variable's type dynamically during runtime, requiring strict upfront planning.

    The Primitive/Object Divide: Primitives aren't objects, meaning they lack methods. To use them in modern data collections (like lists), Java forces a performance overhead called Autoboxing to wrap them into objects (like converting int to Integer).