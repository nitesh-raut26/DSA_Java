package Sorting;

public class insertionSort {
    public static void insertionSorting(int numbers[]) {
        for (int i = 1; i <= numbers.length - 1; i++) { //unsorted part
            int temp = numbers[i];
            for (int j = i - 1; j >= 0; j--) { //sort part insert
                if (temp < numbers[j]) {
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }

    }
    
    public static void insertionSortingby(int numbers[]) {
    for (int i = 1; i < numbers.length; i++) {
        int temp = numbers[i];
        int j = i - 1;
        
        // Shift elements of the sorted part to the right
        while (j >= 0 && numbers[j] > temp) {
            numbers[j + 1] = numbers[j];
            j--;
        }
        // Place the temp value at its correct position
        numbers[j + 1] = temp;
    }
}
    public static void main(String[] args) {
        // Pick an element (from unsorted part) &
        // place in the right pos in sorted part
        int[] numbers = { 4,4,5,4 };
        insertionSortingby(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(numbers[i]+" ");
        }
        System.out.println();
    }
}
