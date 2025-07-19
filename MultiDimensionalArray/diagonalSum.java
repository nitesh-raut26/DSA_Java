package MultiDimensionalArray;

public class diagonalSum {
    public static int diagonaSum(int matrix[][]) {
        int m = matrix[0].length;
        int sum = 0;
        // int oppositeSum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != m - 1 - i) {
                sum += matrix[i][m - i - 1];
            }
        }
        return sum;
        
    }
    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int answer = diagonaSum(matrix);
        System.out.println(answer);
    }
}
