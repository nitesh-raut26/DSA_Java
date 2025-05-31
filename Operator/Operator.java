package Operator;

public class Operator {
    public static void main(String[] args) {
        //Pre Increment
       // int a = 10;
        //int b = ++a;

        // 1. Value Change
        // 2. Value use
       // System.out.println(a);  // 11
        //System.out.println(b); // 11
        

       // Post Increment
       // int c = 10;
       // int d = c++;

        // 1. Value use
        // 2. Value Change
       // System.out.println(c);  // 11
       // System.out.println(d); // 10
        
        // Relational Operator
        System.out.println((2>2));

        // Logical Operator
        System.out.println((5 > 0) && (3 > 2));
        
        // int x = 2, y = 5;
        // int exp1 = (x * y / x); // 5
        // int exp2 = (x * (y / x)); // 4
        // System.out.print(exp1 + " , ");
        // System.out.println(exp2);


        // int x = 200, y = 50, z = 100;
        // if(x > y && y > z){System.out.println("Hello");}
        // if(z > y && z < x){System.out.println("Java");}
        // if ((y + 200) < x && (y + 150) < z) {
        //     System.out.println("Hello java");
        // }


        // int x, y, z;
        // x = y = z = 2;
        // x += y;
        // y -= z;
        // z /= (x + y);
        // System.out.println(x + " " + y + " " + z); //4 0 0


       // int x = 9, y = 12;
      //  int a = 2, b = 4, c = 6;
                           //43              //26        (3+12*4)       /   (2+4*12)
                           //int exp = 4 / 3 * (x + 34) + 9 * (a + b * c) + (3 + y * (2 + a)) / (a + b * y);
                           // 4/3*43+9*26+51/50
        //exp = 43 + 234 + 1 = 278;
       // System.out.println(exp);

        int x = 10, y = 5;
        int exp1 = (y * (x / y + x / y));  //(5*(10/5+10/5)) = 20
        int exp2 = (y * x / y + y * x / y); // (5*10/5+5*10/5) = 20
        System.out.println(exp1);
        System.out.println(exp2);
        
    }
}
