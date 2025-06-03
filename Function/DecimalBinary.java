package Function;

public class DecimalBinary {
    public static int decimalToBinary(int n) {
        int binary = 0;
        int count = 0;
        while (n > 0) {
            int remainder = n % 2;
            binary = remainder * (int)Math.pow(10, count) + binary;
            n = n / 2;
            count++;
        }
        return binary;
    }
    public static void main(String[] args) {
        int result = decimalToBinary(7);
        System.out.println(result);
    }
}
