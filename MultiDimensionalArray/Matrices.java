package MultiDimensionalArray;

import java.util.Scanner;

public class Matrices {

    public static void Search(int matrix[][], int key) {
        int n = matrix.length, m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("true"+ i+j);
                    return;
                }
            }
        }
        System.out.println("key is not present");
     }

    // total cells = rows * columns 3*3 = 9
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        Search(matrix, 8);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
