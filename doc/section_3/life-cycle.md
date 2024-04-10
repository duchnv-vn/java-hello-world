# LIFE CYCLE OF JAVA PROGRAMS
## Compiling process:
- Write Java code inside `.java` files.
- Run `javac` command to start to compile & validate syntax (javac inside JDK package).
- When compilation finished successfully, new files `.class` generated. These files contain bytecode format - semi binary code (Regardless of which OS used for compiling).
- `JVM` reads bytecode of `.class` files and translate into OS specific machine binary executable code.

## Source code structure
- File:
    - File's name must be the exactly same with class name inside
    - File's extesion is `.java`
    - Define fields & methods & constructor inside the class
    - 1 `main` method will be executed when run file

## Notes:
- Execute .class file:
    - At root dir -> Run `java -cp . {package_name...}.{file_name}`