# Compiler Vs. Interpreter

1. Compiler generates system-specific binary, as a seperate file. Interpreter does not generate binary, but converts the program to machine-level instructions and executes continously, line-by-line.

2. Compiler, after generating binary, is not required. But, to run a program via interpreter, a call to it is neccessary everytime it is run.

3. Incase of an error, the compiler does not generate binary, and throws an error message. Interpreter executes the program until it does not find an error.

# How Java Works

Technically, Java is an compiled and interpretted language. Java generates bytecode via its compiler, instead of binary. This bytecode is then interpreted by JVM, which is Java's interpreter.