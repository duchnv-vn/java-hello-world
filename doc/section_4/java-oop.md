# JAVA OBJECT-ORIENTED PROGRAMMING

## Key concepts of OOP

- Class
- Object
- Inheritance
- Interface
- Encapsulation
- Polymorphism
- Abstraction

## Advantages of OOP:

- Reusability
- Modularity
- Easy maintenance
- Encapsulation
- Inheritance & Polymorphism

## Definition of Java class:

- As a template for creating object
- Class contain:
  - Variables - state of object (Fields, attributes)
  - Methods - behavior of object
  - Constructors
  - Static initializers
  - Instance initializers

## Define class and components inside class

- Syntax of define class: `[modifier] class <class-name> {}`.
- Syntax of define variables in class:
  ```
  [modifier] class <class-name> {
    [modifier] <data-type> <variable-name> = <initial-value>;
  }
  ```
- Syntax of define methods in class:

  ```
  [modifier] class <class-name> {
    [modifier] <return-data-type> void <method-name> (<parameters>) {
      <!-- Write code here -->

      <return statement>;
    };
  }
  ```

## Instance initialization

- Constructor:

  ```
  [modifier] class <class-name> {
    public <class-name> (<parameters>) {
      <!-- Write initialzation code here -->
    };
  }
  ```

- Instance initialization block:
  - Utilization reason:
    - Anonymous class: cannot define constructor
  ```
  [modifier] class <class-name> {
    {
      <!-- Write initialization code here -->
    }
  }
  ```
- Static initialization block:
  - Utilization reason:
    - Define static variables:
  ```
  [modifier] class <class-name> {
    static {
      <!-- Write initialization code here -->
    }
  }
  ```

## Life cycle of class:

1. Static initializer block:
2. Instance initializer block (not executed if run file directly):
3. Constructor (not executed if run file directly):
4. Main (if run file directly):

## Memory management in Java:

- Handled by JVM for allocating & de-allocating memory
- Memory's types:
  - <strong>HEAP MEMORY:</strong>
    - Allocate:
      - Objects
    - Reclaimed by JVM's garbage collector when no longer being used
  - <strong>STACK MEMORY:</strong>
    - Allocate:
      - Local variables
      - Method calls
    - When method called -> new stack frame is created on stack
    - When method returns -> stack frame is removed
  - <strong>METHOD AREA / CLASS AREA:</strong>
    - Allocate:
      - Class definitions
      - Method definitions
      - Runtime constants / Static variables
  - <strong>NATIVE HEAP:</strong>
    - Allocate:
      - Native libraries
      - Bytecode will be executed frequently -> JIT compiler convert to native executable code -> Cache

## Important keywords:

- Class
- Object:
  - The same meaning with instance
  - Contain unique set of values
- Instance:
  - The same meaning with object
- Reference:
  - Variable holds memory address of an object
  - Used to access object's properties & methods

## Encapsulation:

- Refer 2 concepts:
  - Group fields (attribute) & methods (behavior) together within a single object
  - Hide some certain fields & methods from public access (using private, protected modifier)
