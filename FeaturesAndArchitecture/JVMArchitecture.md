# Architecture Of Java Virtual Machine (JVM)

JVM is responsible for executing a java program's bytecode. Here's all the components involved in the execution of java programs:

- Class Loader: The .class file, bytecode, to be executed is brought to memory via java's class loader.

- Method Area: This is the location inside JVM's memory where the methods of a .class file are stored.

- Stack: The stack stores all the program variables and references.

- Heap: The heap is responsible for allocating memory to the program as it exexutes.

- Computer Registers: JVM maintains the data to stored to the CPU's registers.

- Native Method Stack: Java has support for the languages like C and C++, So, when such languages are used, a seperate stack is created for them.

- Execution Engine: The .class file is interpreted via the execution engine. It contains a JIT (Just-In-Time) Compiler, as well as the interpreter for execution.

- Native Method Interface: This part of JVM is responsible for managing the connections between its execution engine, and the native method libraries called.
