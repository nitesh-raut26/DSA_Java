package Sorting;

public class countingSort {
    public static void countingSorting(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            largest = Math.max(largest, numbers[i]);
        }
        System.out.println(largest);
        int frequency[] = new int[largest + 1];
        for (int i = 0; i < numbers.length; i++) {
            frequency[numbers[i]]++;
        }
        // for (int i = 0; i < frequency.length; i++) {
        //     System.out.print(frequency[i] + " ");
        // }

        // Ascending Order
        System.out.println(frequency.length);
        int count = 0;
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                numbers[count++] = i;
                frequency[i]--;
            }
        }

        // Descending Order
        for (int i = frequency.length - 1; i >= 0; i--) {
            while (frequency[i] > 0) {
                numbers[count++] = i;
                frequency[i]--;
            }
        }
    }
    public static void main(String[] args) {
        // Counting Sort
        // It is used when the elements is less range between and max is less.
        // 1, 4, 1, 3, 2, 4, 3, 7
        // min -max is 1 to 7 so it is less
        // we used frequency array
        int numbers[] = { 1, 2, 1, 3, 7, 4, 5, 3,4,5,6,7 };
        countingSorting(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }
}
