package Function;

public class PracticeQ {

    // Q1.
    // Write a Java method to compute the averageof three numbers.
    public static void averageNumber(int a, int b, int c) {
        int average = 0;
        average = (a + b + c) / 3;
        System.out.println(average);
        
    }
   
    // Q2.
    // Write a method named is Even that accepts an int argument.The method should
    // return true if the argument iseven,or false otherwise.Also write a program to test your method.
    public static boolean isEven(int n) {
        return n % 2 == 0 ? true : false;

    }
    
    public static int Reverse(int n) {
        int reverse = 0;
        while (n > 0) {
            int remainder = n % 10;
            reverse = remainder + reverse * 10;
            n = n / 10;
        }
        return reverse;
    }

    

    // Write a Java program to check if a number is a palindrome in Java?
//    (121 is a palindrome, 321 is not)
    // Q3. palindrome Number
    public static boolean isPalindrome(int n) {
        int reverseNumber = Reverse(n);
        System.out.println(reverseNumber + "reverse");
        return n == reverseNumber ? true : false;
    }
    
    // Q4.
    // Write a java method to compute the sum of the digits in an integer.
    public static int sumInteger(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }


    public static void main(String[] args) {
        averageNumber(2, 3, 4);
        System.out.println(isEven(5));
        System.out.println(isPalindrome(1221));
        System.out.println(sumInteger(121567));
    }
}
