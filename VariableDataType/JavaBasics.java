import java.util.Scanner;
// import java.util.*;

//import javax.swing.plaf.synth.SynthLookAndFeel;

public class JavaBasics {
    public static void main(String args[]) {
        //         // Output in java
        //         System.out.print("1 2 3 4 5");
        //         System.out.println("Hello World!"); // line space
        //         System.out.print("write the program\n"); // \n next lines 
        //         System.out.print("New line comes \n");
        //         System.out.println("     Hello World!   ");
        //         int a = 10;
        //         int b = 23;
        //         System.out.println((a));
        //         System.out.println(b);
        //         String name = "Toney Stark";
        //         System.out.println(name);

        //         a = 23;
        //         System.out.println(a);

        //         // byte range is -128 to 127 means total 255
        //         byte c = -128;     
        //         System.out.println(c);

        //         char ch = 'a';
        //         System.out.println(ch);

        //         boolean var = false;
        //         System.out.println(var);

        //         float price = 10.5f;
        //         System.out.println(price);

        //         int number = 25;
        //         System.out.println(number);
        //     }

        //For input in Java
        //  It takes the only before the space taking string 
        Scanner sc = new Scanner(System.in);
        // String input = sc.next();
        // System.out.println(input);

        // for the whole word taking we should used nextLine
        // String name = sc.nextLine();
        // System.out.println(name);

        // int number = sc.nextInt();
        // System.out.println(number);

        //boolean ans = sc.nextBoolean(); //true or false
       // System.out.println(ans);
        
    //    short is 2 byte refer to the DataTypes.txt
        // short number = sc.nextShort();
        // System.out.println(number);


        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum = a + b;
        // int mul = a * b;
        // System.out.println(sum);
        // System.out.println(mul);

        // Area of circle
        float pi = 3.14f;

        int radius = sc.nextInt();
        float area = pi * radius * radius;
        System.out.println(area);

        // Type Casting / narrowing conversion /explicit conversion
        float marks = 99.999f;
        int marks2 = (int) marks;
        System.out.println(marks2); // 99 and remove all the decimal that have written next it eliminated not round off.
        
        double result = 99.80;
        int result2 = (int) result;
        System.out.println(result2);

        float f1 = 1234567.0f;

        System.out.println(f1);

        // Type Promotion only in the expression in java
        //  Java automatically promotes each byte, short , or char operand to int when
        //    evaluating an expression.

        // If one operand is long, float or double the whole expression is promoted
    //    to long, float or double respectively.
       
        char a = 'a';
        // char b = 'b';
        System.out.println((int) a); //97
        // System.out.println((int) b); //98
        // System.out.println(b); // 'b'
        // System.out.println(a - b); //-1
        
        // Wrong 
        byte b = 5;
        // u write the byte and multiplying with variable and it becomes and expression so that it convert to int
        // so it is wrong so U have to write the byte b = b*2; it's wrong 
        // int c = b * 2;
        //  b = b * 2;
        System.out.println(b);

        // right this way 
        b = (byte) (b * 2);
        System.out.println(b);


        //  Java allows letters (A–Z, a–z), digits (0–9), underscore _, and dollar sign $ in variable names.
        //  But variable names cannot start with a digit, and cannot use reserved words like class, int, if, etc.
    
        int $ = 24;
        System.out.println($);

        

    }
}