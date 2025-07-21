package BitManipulation;

public class CountSetBits {

    // Count Set Bits in a Number.
    // 10 -> 1010
    // no of set bits = 2

    // n= 1010 LSB= 0 n>>1 count = 0
    // n= 0101  LSB = 1 n>>1 count = 1
    // n= 0010  LSB = 0 n>>1 count = 1
    // n= 0001  LSB = 1 n>>1 count = 2
    // n= 0000  LSB = 1 n>>1 count = 2
    // terminate
    // 

    // In bits we have the run the algorithm is (logn)
    // total bits represnt for the number is logn
    // max --> logn+1
    // 16--> 10000 --> 5 bits (log16)+1 = 5
    // O(log2n)

    public static int countSetBit(int nums) {
        int count = 0;
        while (nums != 0) {
            if ((nums & 1) == 1) {  //check LSB
                count++;
            }
            nums = nums >> 1;
        }
        return count;
        
    }

    public static void main(String[] args) {
        int nums = 15;
        System.out.println(countSetBit(nums));
    }
}
