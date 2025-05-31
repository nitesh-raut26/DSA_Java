package Patttern;

import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


        // print inverted-star Pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
       
        // print half-pyramid
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
     

        System.out.println('a'+1);
        // print Character pattern
        int count = 0;
        char ch = 'A';
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                // char ch = (char) (65);
                // System.out.print((char) (65+count));
                System.out.print(ch);
                ch++;
                // count++;
            }
            System.out.println();
        }

    }
}
