package Sorting;

public class bubbleSort {
    public static void bubbleSorting(int[] numbers) {
        for (int i = numbers.length-1; i > 0;i--) {
            for (int j = 0; j < i; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;
              }
           }
       }   
    }
    public static void main(String[] args) {
        // We have to compare the elements and large elements come to end of an array
        // by swapping with adjacent elements.

        int numbers[] = {6,7 };
         bubbleSorting(numbers);
         for (int i = 0; i < numbers.length; i++) {
             System.out.print(numbers[i] + " ");
         }
        System.out.println();

    }
}
