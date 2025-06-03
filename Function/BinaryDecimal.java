package Function;

import java.util.Scanner;

public class BinaryDecimal {
    public static int Decimal(int lastDigit,int count) {
        return lastDigit*(int)Math.pow(2, count);
    }
    
    public static int lastDigit(int n) {
        int decimal = 0;
        int count = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            int decimalNumber = Decimal(lastDigit,count);
            decimal = decimal + decimalNumber;
            n = n / 10;
            count++;
        }
        return decimal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(lastDigit(n));
    }
}
