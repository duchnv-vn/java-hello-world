# PRIMITIVE DATA TYPES

## Declare primitive variables

- Syntax: `{type} {variable_name} = {value};`
  - Primitive types:
    - boolean (1 bit)
    - char (2 bytes - 16 bits)
    - byte (1 byte - 8 bits)
    - short (2 bytes - 16 bits)
    - int (4 bytes - 32 bits)
    - long (8 bytes - 64 bits)
    - float (4 bytes - 32 bits)
    - double (8 bytes - 64 bits)

## Type casting
- Widening casting (`byte -> ... -> long -> ... -> double`):
  - Convert from smaller to larger type size.
  - Automatically handle by compiler.
  - No data lost.
- Narrowing casting (`double-> ... -> long -> ... -> byte`):
  - Covert from larger to smaller type size.
  - Manually handle by programmer.
  - Data lost.
  - Rise error in compile.