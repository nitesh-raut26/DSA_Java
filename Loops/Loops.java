package Loops;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // print number from 1 to 10
        /* 
        
        int counter = 1;
        while (counter <= 10) {
            // System.out.println("counter is " + counter);
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println(" ");
        
        */

        // print number 1 to n;
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        /* 
        
        int counter = 1;
         while (counter <= number) {
            // System.out.println("counter is " + counter);
            System.out.print(counter + " ");
            counter++;
        }
        System.out.println(" ");
        
        */

        // print sum of first n natural numbers
        /* 
        int sum = 0;
        int counter = 1;
        while (counter <= number) {
            sum += counter;
            counter++;
        }
        sum = 0;
        // other approach
        sum = number * (number + 1) / 2;
        System.out.println(sum);
    

        // for loop
        // for(initialisation;condition;updation)
        // for (int i = 1; i <= 10; i++) {
        //     System.out.println("Hello World");
        // }

        // print square print
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
       */
        // Print reverse of a number
        // n = 10899
        // last digit come when u divide any number by 10 remainder becomes last digit
        // like 132 % 10 = 2

        // last digit = num%10;
        // remove last digit = num/10;

        /* 
        int reverseNumber = 0;
        while (number > 0) {
            reverseNumber = (reverseNumber*10) + (number % 10);
            number = number / 10;
         }
         System.out.println(reverseNumber);
        
         //    do while loop
         int counter = 1;
         do{
            System.out.println("Hello World");
            counter++;
         }
         while (counter <= 10);
        
         //  break 
         // to exit the loop
         for (int index = 0; index <= 5; index++) {
             if (index == 3) {
                 break;
             }
             System.out.println(index);
         }
        System.out.println("I am out of the loop");
        
         */


        // keep entering numbers till user enters a multiple of 10
        // while (true) {
        //     if (number % 10 == 0) {
        //         break;
        //     }
        //     number = sc.nextInt();
        // }
        // System.out.println("you are out of the multiple of 10");

        // Continue Statement
        // to skip an iteration
        // for (int i = 0; i < 5; i++) {
        //     if (i == 3) {
        //         continue;
        //     }
        //     System.out.println(i);
        // }
       
        //  Check  if a number is prime or not
        //  prime 2,3,5,7,11
        boolean answer = false;
        if (number <= 1) {
             answer = true;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number == 2) {
                break;
            }
            if (number % i == 0) {
                answer = true;
                break;
            }

        }
        String primeResult = answer ? "Non Prime" : "Prime";
        System.out.println(primeResult);

        

    }
}