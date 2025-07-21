package BitManipulation;

public class BitManipulation {

    public static int getIthBit(int nums, int pos) {
        int bitmask = 1 << pos;
        if ((nums & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }

    }
    
    public static int setIthBit(int nums, int pos) {
        int bitmask = 1 << pos;
        return nums | bitmask;
    }
    
    public static int clearIthBit(int nums, int pos) {
        int bitmask = ~(1 << pos);
        return nums & bitmask;

    }

    public static int clearLastIthBit(int nums, int pos) {
        // int num = (int) Math.pow(2, pos) - 1;
        // int bitmask = ~(num);
        // return nums & bitmask;

        // -1 and ~(0) have same 111111 like this have 
        int bitmask = ~(0) << pos;
        return nums & bitmask;
    }
    
    public static int updateIthBit(int nums, int pos, int newBit) {
        // if (newBit == 0) {
        //     return clearIthBit(nums, pos);
        // }
        // else {
        //     return setIthBit(nums, pos);
        // }

        nums = clearIthBit(nums, pos);
        int bitmask = newBit << pos;
        return nums | bitmask;
    }

    // clear range of bits
    // n = 100111010011 , i = 2, j = 7

    public static int clearRangeBit(int nums, int i, int j) {
        int a = ~(0) << j + 1;
        // System.out.println(a);
        // int b = (int) Math.pow(2, i) - 1;
        // or
        // we can write this
        int b = (1 << i) - 1;
        int bitmask = a | b;
        // System.out.println(b);
        return bitmask & nums;
       
    }





    // clear last ith bits
    // 15 = 1111 , i = 2
    // output  = 1100




    public static void main(String[] args) {
        System.out.println((5 & 6)); // 4 -- bitwise and it gives the 4 answer
        System.out.println((5 | 6)); // 7 --> bitwise or it gives the 101 | 110 --> 111 -> 7 answer
        System.out.println(5 ^ 6); // 3  -->  bitwise xor
        System.out.println(~5); //-6
        System.out.println(~0); // -1
        System.out.println(5 << 2); // formula is a*2^b;
        System.out.println(5 >> 2); //Formula is a>>b = a/2^b 
        System.out.println((4 & 1));

        System.out.println(getIthBit(5, 3));
        System.out.println(setIthBit(10, 2));
        System.out.println(clearIthBit(10, 1));
        System.out.println(updateIthBit(10, 2, 1));
        System.out.println(clearLastIthBit(15, 0));
        System.out.println(clearRangeBit(2515, 2,7));
    }
}
