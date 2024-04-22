# JAVA ARRAYS

## Common operations

1. Declare & Initialize
2. For loop & For each loop
3. Copying
4. Converting

   - Convert to string
     - Arrays.toString()
     - Arrays.deepToString()
   - Convert to list
     - Arrays.asList()
   - Convert to stream
     - Arrays.stream()

5. Sorting

   - Arrays.sort()
   - Arrays.parallelSort()

6. Searching

   - Arrays.binarySearch()

7. Filling
   - Arrays.fill()

## Multi-dimensional arrays

- Syntax of declare & initialize:
  ```
  <dataType>[1st dimension][2nd dimension]...[Nth dimension] arrayName = new <dataType>[length 1][length 2]...[length N];
  ```
- Two-dimensional arrays (2D arrays):
- Addition of 2 matrices:

  ```
  int[][] array1 = {...};
    int[][] array2 = {...};
    int[][] additionArray = new int[length 1][length 2];

    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array1[i].length; j++) {
        additionArray[i][j] = array1[i][j] + array2[i][j];
      }
    }
  ```

- Jagged arrays:
  ```
  int[][] jaggedArray = new int[length 1][];
  ```
- Three-dimensional arrays (3D arrays):
  - 3D arrays contain multiple 2D arrays
    ```
    int[][][] = threeDArray = new int[3][4][5];
    // -> There are 3 2D arrays, each with 4 rows and 5 columns
    ```
