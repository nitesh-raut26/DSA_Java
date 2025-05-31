package Loops;

import java.util.Scanner;

public class PracticeQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       // int sum = 0;
        // while (true) {
        //     int integer = sc.nextInt();
        //     if (integer % 2 == 0 || integer % 2 != 0) {
        //         sum += integer;
        //     } else {
        //         break;
        //     }
        // }
        // System.out.println(sum);


        // Write a program to find the factorial of any number enterd by the user.
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }
        System.out.println(factorial);

        for (int i = 1; i <= 10; i++) {
            System.out.println(n * i + " ");
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }
    }
}
