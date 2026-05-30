# Introduction to Java Memory Management


Q: Where does Java manage application runtime data?
=> The Java Virtual Machine (JVM) divides system memory into distinct logical regions during execution. The two most critical regions for programmers to understand are Stack Memory and Heap Memory.

______________________________________________________________________________________________________________________________

1. Stack memory


Q: What is Stack Memory and how does it operate?
=> Stack memory is a physically organized, sequential memory structure that operates on a Last-In, First-Out (LIFO) basis. Each running thread in a Java application gets its own completely isolated stack area.

Q: What exactly is stored inside Stack Memory?
=>
    Stack Frames: Every time a method is called, a fresh block of memory called a "frame" is pushed onto the top of the stack. This frame stores all the method's local variables and primitive values.

    Object References: For non-primitive data types, the actual object lives on the Heap, but the reference address variable pointing to it lives inside the Stack frame.

    its corresponding stack frame is automatically popped off and destroyed.


2. Heap Memory

Q: What is Heap Memory and how does it operate?
=> Heap memory is a vast, structurally dynamic, global memory space used for dynamic allocation. Unlike the Stack, all threads share a single, central Heap area.

Q: What exactly is stored inside Heap Memory?
=> All objects, instances of classes, arrays, static variables and explicit data structures created with the new keyword live here. Heap objects are accessible globally across the application as long as a valid reference to them exists.



        STACK MEMORY                         HEAP MEMORY
  (Thread-Isolated, LIFO)               (Shared, Dynamic)
┌─────────────────────────┐         ┌─────────────────────────┐
│ main() Frame            │         │                         │
│ ┌─────────────────────┐ │         │  ┌───────────────────┐  │
│ │ int age = 25;       │ │         │  │   Employee Object │  │
│ │                     │ │         │  │   name: "Alex"    │  │
│ │ empRef ───────────────┼─────────┼─►│   id: 1042        │  │
│ └─────────────────────┘ │         │  └───────────────────┘  │
└─────────────────────────┘         └─────────────────────────┘ 