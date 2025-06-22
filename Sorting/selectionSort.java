package Sorting;

public class selectionSort {
    public static int smallestNumber(int numbers[],int start,int end) {
        int indx = -1;
        int miniNumber = Integer.MAX_VALUE;
        for (int i = start; i <= end; i++) {
            if (numbers[i] < miniNumber) {
                miniNumber = numbers[i];
                indx = i;
            }
        }
        return indx;

    }

    public static void selectionSorting(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int indx = smallestNumber(numbers, i, numbers.length - 1);
            int temp = numbers[i];
            numbers[i] = numbers[indx];
            numbers[indx] = temp;
        }
    }


    public static void selectionSortingMethod(int numbers[]) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int minPos = i;
            for (int j = i + 1; j <= numbers.length - 1; j++) {
                if (numbers[minPos] > numbers[j]) {
                    minPos = j;
                }
            }
            int temp = numbers[minPos];
            numbers[minPos] = numbers[i];
            numbers[i] = temp;
        }
    }
    public static void main(String[] args) {
        //pick the smallest from unsorted , put 
        // it at the beginning.
        int[] numbers = { 9, 5, 7, 2, 3,0 };
        selectionSortingMethod(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
