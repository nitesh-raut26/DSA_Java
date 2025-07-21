package BitManipulation;

// check if a number is a Power of 2 or not.
// power of two is in binary that when we multiply the n & n-1  = 0 then it is power of 2 and ohterwise not

public class PowerTwo {
    public static boolean isPowerTwo(int nums) {
        if ((nums & nums - 1) == 0) {
            return true;
        }
        else {
            return false;
        }
        
    }
    public static void main(String[] args) {
        int nums = 64;
        System.out.println(isPowerTwo(nums));
        
    }
}
