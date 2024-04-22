package section_12;

import java.util.Arrays;
import java.util.Random;

public class Section12 {
  public static void main(String[] args) {
    // SORTING
    int[] smallArray = { 0, 9, 10, 200, 2, 1 };
    Arrays.sort(smallArray);

    // int[] largeArray = new int[10_000];
    // Random random = new Random();
    // for (int i = 0; i < largeArray.length; i++) {
    // largeArray[i] = random.nextInt(1_000_000);
    // }
    // Arrays.parallelSort(largeArray);

    // SEARCHING
    int index = Arrays.binarySearch(smallArray, 3);
    int targetNumber = index >= 0 ? smallArray[index] : 0;
    // System.out.println("index:" + index);
    // System.out.println("targetNumber:" + targetNumber);

    // FILLING
    float[] floatArray = new float[10];
    Arrays.fill(floatArray, 9.9f);
    // System.out.println("Float array:" + Arrays.toString(floatArray));

    // 2D ARRAYS
    int[][] twoDArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }, };
    // System.out.println("twoDArray: " + Arrays.deepToString(twoDArray));

    // ADDITION OF 2 MATRICES (2 MULTI-DIMENSIONAL ARRAYS)
    int[][] array1 = { { 1, 1, 1 }, { 1, 1, 1 }, { 1, 1, 1 } };
    int[][] array2 = { { 2, 2, 2 }, { 2, 2, 2 }, { 2, 2, 2 } };
    int[][] additionArray = new int[3][3];
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array1[i].length; j++) {
        additionArray[i][j] = array1[i][j] + array2[i][j];
      }
    }
    // System.out.println("additionArray: " + Arrays.deepToString(additionArray));

    // JAGGED ARRAYS
    int[][] jaggedArray1 = {
        { 1, 2, 3, 4 },
        { 5, 6, 7 },
        { 8, 9 },
        { 10 }
    };
    // System.out.println("jaggedArray1: " + Arrays.deepToString(jaggedArray1));

    int[][] jaggedArray2 = new int[3][];
    int[] subJaggedArray1 = { 6, 8, 4 };
    int[] subJaggedArray2 = {};
    int[] subJaggedArray3 = { 33, 11 };
    jaggedArray2[0] = subJaggedArray1;
    jaggedArray2[1] = subJaggedArray2;
    jaggedArray2[2] = subJaggedArray3;
    // System.out.println("jaggedArray2: " + Arrays.deepToString(jaggedArray2));

    // 3D ARRAYS
    int[][][] threeDArray = {
        {
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 },
            { 1, 2, 3, 4 },
        },
        {
            { 5, 6, 7, 8 },
            { 5, 6, 7, 8 },
            { 5, 6, 7, 8 },
        },
    }; // new int[2][3][4]
  }
}
