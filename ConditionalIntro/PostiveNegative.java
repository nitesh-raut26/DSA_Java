package ConditionalIntro;

import java.util.Scanner;

public class PostiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        String res = ((number > 0) ? "positive" : "negative");
        System.out.println(res);


        // print the fever above 100 or otherwise not fever .

        double temp = 103.5;
        if (temp > 100) {
            System.out.println("You have a fever");
        }
        else {
            System.out.println("You don't have fever");
        }

        // int number = 1;
        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                 System.out.println("There is no weeek name");
                break;
        }
        
        if (number % 4 != 0) {
            System.out.println("Not a leap Number");
        }
        else {
            if (number % 100 == 0 && number % 400 == 0) {
                System.out.println("Leap year");
            }
            else if (number % 100 != 0) {
                System.out.println("Leap Year");
            }
            else {
                System.out.println("Not a leap Number");
            }
         }

    }
}
