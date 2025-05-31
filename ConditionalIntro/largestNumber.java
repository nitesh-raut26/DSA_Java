package ConditionalIntro;

import java.util.Scanner;

public class largestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // int a = 12;
        // int b = 10;
        if (a > b) {
            System.out.println("a is larger than b");
        }
        else {
            System.out.println("b is greater than a");
        }
    }
}
