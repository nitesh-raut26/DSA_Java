package MultiDimensionalArray;

public class PracticeQs {

    // Q1. Print he number of 7's that are in the 2d array.
    public static void printNumber(int matrix[][]) {
        int totalNumber = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 7) {
                    totalNumber += 1;
                }
            }
        }
        System.out.println(totalNumber);
    }

    //Q2. Print out the sum of the numbers in the second row of the "nums" array.
    public static void secondrowSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum += matrix[1][i];
        }
        System.out.println(sum);
    }

    //Q3. Write a program to find the Transpose of a matrix.
    

    public static void main(String[] args) {
        int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        printNumber(matrix);
        secondrowSum(matrix);

    }
}
