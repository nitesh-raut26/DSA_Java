package ConditionalIntro;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        // int number = 13;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number % 2 == 0) {
            System.out.println("Number is even");
        }
        else {
            System.out.println("Number is odd");
        }
    }
}
