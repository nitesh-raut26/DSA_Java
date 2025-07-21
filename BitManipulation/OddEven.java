package BitManipulation;

public class OddEven {

    // for the odd LSB is always is 1 and for the even is LSB is always 0.
    // 0 = 000
    // 1 = 001
    // 2 = 010
    // 3 = 011
    // 4 = 100
    // 5 = 101

    public static void isOddEven(int nums) {
        int bitmask = 1;
        if ((nums & bitmask) == 0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
        
    }

    public static void main(String[] args) {
        int nums = 16;
        isOddEven(nums);
    }
}
