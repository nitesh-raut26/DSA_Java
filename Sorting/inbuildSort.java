package Sorting;

// import java.util.*;
import java.util.Arrays;
// starting index to end index
// Arrays.sort(arr,si,ei);
// O(nlogn)
// import java.util.Collection;
import java.util.Collections;

// we have to use the reverseOrder then we write the code
// Arrays.sort(arr,Collections.reverseOrder());
// Arrays.sort(arr,si,ei,Collections.reverseOrder());


public class inbuildSort {
    public static void main(String[] args) {
        Integer[] numbers = { 2, 7, 4, 3, 1, 9, 5, 6, 7, 10, 20 };
        Arrays.sort(numbers);

        // Collection is working only on object and it does not work on primitive dataType.
        // So used Integer and String

        // numbers is a primitive int[] array, but Collections.reverseOrder() works only with objects, like Integer[].
        Arrays.sort(numbers, 3, 7, Collections.reverseOrder());
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
