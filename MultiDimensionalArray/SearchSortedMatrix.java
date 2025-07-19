package MultiDimensionalArray;

// Search for a key in row wise & col wise sorted matrix.

// There is two cells that have to analyse the where I have to move in the 
// sorted matrix is (0,m-1) and (n-1,0) these two cells decide whether to move the direction 
//  we can use the any key cells use 

// (n-1,0)                   |         // (0,m-1)
// key < cellvalue           |         // key < cellvalue
//   top move                |         // left move
// key > cellvalue           |         // key > cellmove
//   right move              |           Bottom move 

// staircase search

public class SearchSortedMatrix {


    public static boolean searchMatrix(int matrix[][], int key, int cellvalue, int i, int j) {
        System.out.println(cellvalue);
        if (i >= matrix.length || j < 0) {
            return false;
        }

        if (key < cellvalue) {
            return searchMatrix(matrix, key, matrix[i][j - 1], i, j - 1);
        } else if (key > cellvalue) {
            return searchMatrix(matrix, key, matrix[i + 1][j], i + 1, j);
        }

        return true;
    }
     
    // second method time complexity is maximum lenght row or col O(n+m)
    public static boolean stairSearch(int matrix[][], int key) {
        int row = 0, col = matrix[0].length - 1;
        while (row < matrix.length && col >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("found key at (" + row + "," + col + ")");
                return true;
            } else if (key < matrix[row][col]) {
                col--;
            } else {
                row++;
            }
        }
        System.out.println("key not found");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 }, { 15, 25, 35, 45 }, { 27, 29, 37, 48 }, { 32, 33, 39, 50 } };
        int key = 99;
        int cellvalue = matrix[0][matrix[0].length - 1];
        // boolean result = searchMatrix(matrix, key, cellvalue, 0, matrix[0].length - 1);
        boolean result = stairSearch(matrix, key);
        System.out.println(result);

    }
}
