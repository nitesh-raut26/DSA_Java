package BitManipulation;

public class PracticeQs {

    // Swap two numbers without using any third variable.
    public static void swapNumber(int a, int b) {
        // a = a + b;
        // b = a - b;
        // a = a - b;
        // System.out.println(a + " " + b);

        // xor properties
        // a^0 = a
        // a ^ a = 0
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println(a + " " + b);

    }
    

    // Q3. Add 1 to an integer using Bit Manipulation.
    // (try using Bitwise NOT Operator)

    public static int addOneInteger(int nums) {
        return -(~(nums));
    }

    // Q4. Convert uppercase character to lowercase using bits.
     public static void upperToLower() {
         for (char ch = 'A'; ch <= 'Z'; ch++) {
             System.out.print((char)(ch | ' '));
         }
           System.out.println();
    }



    public static void main(String[] args) {
        int a = 5, b = 6;
        swapNumber(a, b);
        System.out.println(a + " " + b);
        System.out.println(addOneInteger(10));
        upperToLower();
    }
}
