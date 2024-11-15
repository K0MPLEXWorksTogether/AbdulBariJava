# A Deeper Dive Into JVM Architecture


1. Class Loader: The class loader internally, does three jobs: loading, linking and initialization.

    - Loading: This step loads all .class files into memory and stores them inside the method area. It contains three types of loaders.
        
        - Bootstrap Class Loader: This loader loads all the files that are provided and used by Java SE into the program.
        - Application Class Loader: This loader loads all the class files for the current program.
        - Extension Class Loader: This loader loads classes required for JVM itself into the program
    
    - Linking: Say I have function `fun1()`, calling a function called `fun2()`. Now, so that no runtime errors are thrown, I need to write a reference of `fun2()` inside `fun1()`'s body. This step is known as linking. This is also done in three steps:

        - Verify: Before writing references, the linker checks if the so far loaded bytecode is matching the regex patterns. This makes java's code very secure.
        - Prepare: This step allocates memory for static objects in the method area itself.
        - Resolve: Now, the actual references are written.

    - Initialization: All static objects are initialized here. Also, all static blocks inside java are executed.

2. Stack: Java supports multi-threadding. So, for each thread a seperate stack is created.

3. Computer Registers: For each thread, seperate registers are also kept.

4. Execution Engine: It also contains a garbage collector, that de-allocates space allocated for variables in the stack.