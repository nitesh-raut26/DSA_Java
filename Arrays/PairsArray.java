package Arrays;

public class PairsArray {


    // pairs in Array

    // [2,4,6,8,10]

    // (2,4) (2,6) (2,8) (2,10)
    // (4,6) (4,8) (4,10)
    // (6,8) (6,10)
    // (8,10)
    public static void pairArray(int numbers[]) {
        int totalpairs = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                System.out.print("(" + numbers[i] + "," + numbers[j] + ")" + " ");
                totalpairs++;
            }
            System.out.println();
        }
        System.out.println("totalpairs is " + totalpairs);
        // formula of totalpairs = n*(n-1)/2;  n is number of elements
   }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 13 };
        pairArray(numbers);
    }
}
