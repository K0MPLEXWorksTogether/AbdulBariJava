# How Is Java Platform Independent?

Once a java program is compiled to generate bytecode, this bytecode is interpreted by JVM. JVM continously makes system calls to the respective operating system, which in turn, gets the job done.

Therefore, once a program is compiled, it can run anywhere, via JVM. **Java's bytecode is platform independent, but JVM is not.**