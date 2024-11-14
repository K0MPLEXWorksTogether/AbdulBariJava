# Understanding The "Hello, World!" Program In Java

```java
class HelloWorld{
    public static void main(String args[]){
        System.out.println("Hello, World!");
    }
}
```

- This is a "Hello, World!" program written in java. Let us break it down to understand how it executes.

- `class HelloWorld`: Java is an object-oriented programming language. So, nothing is outside classes in java. 

- `public`: When this program is run, JVM simply calls HelloWorld.main(). To make such a call, the method must be left to be main.

- `static`: To call a method, an object needs to be created firstly. So, to allow JVM to make a call, we need to allocate space for this method in the program's stack. This is done using the static keyword.

- `void`: It is the return type of the method. Java is statically typed. All methods must have a return type. Void indicated that the method returns nothing.

- `System.out`: System is a class. Inside this class, there is an attribute called out. This attribute is of type "java.io.PrintStream". 

- `println()`: This is a method of the class java.io.PrintStream. `java` is the root package for the entire language. `io` is a package inside this package. `PrintStream` is class inside the `io` package.
