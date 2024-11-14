# Running Java Programs

- To run java programs, we need a software called Java Development Kit (JDK). It contains, some compilers (javac), debuggers, and additional tools, with Java Runtime Environment (JRE). JRE is responsible for running compiled java programs' bytecode. 

- JRE internally contains all the batteries, or precompiled java class files sent as libraries, as well as the Java Virtual Machine (JVM). This is the entity that is reponsible for executing java programs on a machine.

- Consider a java source file named program.java. Firstly, we use javac to compile this program to generate a bytecode file named program.class. Then, this file is interpreted by the JVM, executed by JRE.