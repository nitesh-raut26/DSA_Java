package MultiDimensionalArray;

public class spiralMatrix {

    public static void spiralmatrixOrder(int matrix[][]) {
    int n = matrix.length, m = matrix[0].length;
    int totalCell = n * m;
    int count = 0;
    int startRow = 0, endRow = n - 1, startCol = 0, endCol = m - 1;
    
    while (count < totalCell) {
        for (int i = startCol; i <= endCol && count < totalCell; i++) {
            System.out.print(matrix[startRow][i] + " ");
            count++;
        }
        startRow++;
        
        for (int i = startRow; i <= endRow && count < totalCell; i++) {
            System.out.print(matrix[i][endCol] + " ");
            count++;
        }
        endCol--;
        
        for (int i = endCol; i >= startCol && count < totalCell; i--) {
            System.out.print(matrix[endRow][i] + " ");
            count++;
        }
        endRow--;
        
        for (int i = endRow; i >= startRow && count < totalCell; i--) {
            System.out.print(matrix[i][startCol] + " ");
            count++;
        }
        startCol++;
    }
    System.out.println();
    }
    //     int n = matrix.length, m = matrix[0].length;
    //     int totalCell = n * m;
    //     int count = 1;
    //     int startRow = 0, endRow = n - 1, startCol = 0, endCol = m - 1;
    //     while (count <= totalCell) {
    //         for (int i = startCol; i <= endCol; i++) {
    //              if (count > totalCell) {
    //                  return;
    //              }
    //             System.out.print(matrix[startRow][i] + " ");
    //         }
    //         startRow++;
    //         if (count <= totalCell) {
    //             ++count;
    //         }
    //         else {
    //             break;
    //         }
    //         for (int i = startRow; i <= endRow; i++) {
    //             if (count > totalCell) {
    //                  return;
    //              }
    //             System.out.print(matrix[i][endCol] + " ");
    //         }
    //         endCol--;
    //         if (count <= totalCell) {
    //             ++count;
    //         }
    //         else {
    //             break;
    //         }
    //         for (int i = endCol; i >= startCol; i--) {
    //             if (count > totalCell) {
    //                  return;
    //              }
    //             System.out.print(matrix[endRow][i] + " ");
    //         }
    //         endRow--;
    //         if (count <= totalCell) {
    //             ++count;
    //         }
    //         else {
    //             break;
    //         }
    //         for (int i = endRow; i >= startRow; i--) {
    //             if (count > totalCell) {
    //                  return;
    //              }
    //             System.out.print(matrix[i][startCol] + " ");
    //         }
    //         startCol++;
    //         if (count <= totalCell) {
    //             ++count;
    //         }
    //         else {
    //             break;
    //         }
    //     }
    //     System.out.println();

    // }
    // 1  2  3
    // 4  5  6
    // 7  8  9
    // 10 11 12
    // 13 14 15
    public static void main(String[] args) {
        int matrix[][] = new int[4][4];
        int n = matrix.length, m = matrix[0].length;
        System.out.println(n);
        System.out.println(m);
        int count = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = count++;
            }
        }
        spiralmatrixOrder(matrix);
        //  for (int i = 0; i < n; i++) {
        //      for (int j = 0; j < m; j++) {
        //          System.out.print(matrix[i][j]+" ");
        //      }
        //     System.out.println();
        // }

    }
}
