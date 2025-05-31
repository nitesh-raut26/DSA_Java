package ConditionalIntro;

public class Conditional {
    public static void main(String[] args) {

        // Without extra variable swap the numbers.
        int e = 10, d = 7;
        e = e + d;
        d = e - d;
        e = e - d;
        System.out.println(e+ "," + d);

        int a = 10, b = 3, c = 7;
        boolean ans = false;
        if (a + b + c == 20) {
            System.out.println("sum is good");
        }
        if (!ans) {
            System.out.println("true");
        }
        if (a + b == 14) {
            System.out.println("sum is good one");
        }
         if (a + b == 13) {
            System.out.println("sum is not good one");
        }
        else if(a+c == 17){
            System.out.println("hello a+c");
        }
    }
}
