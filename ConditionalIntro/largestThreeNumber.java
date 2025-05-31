package ConditionalIntro;

public class largestThreeNumber {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 16;
        if (a >= b && a >= c) {
            System.out.println("a is largest " + a);
        }
        // else if (a > b && a < c) {
        //     System.out.println("c is largest " + c);
        // }
        // else if (a < b && b < c) {
        //     System.out.println("c is largest " + c);
        // }
        // else {
        //     System.out.println("b is largest "+ b);
        // }
        else if (b >= c) {
            System.out.println("b is largest " + b);
        }
        else {
            System.out.println("c is largest " + c);
        }
       
        // ternary operator
        int number = 5;
        String answer = ((number % 2 == 0) ? "even" : "odd");
        System.out.println(answer + " number");

        int marks = 9;
        String result = ((marks >= 33) ? "pass" : "fail");
        System.out.println(result);

    }
}
