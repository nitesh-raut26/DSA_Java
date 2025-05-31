import java.util.Scanner;

// import javax.swing.plaf.synth.SynthLookAndFeel;

public class PracticeQ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1.Q
        // int n = 3;
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // double c = sc.nextInt();
        // double average = (a + b + c) / n;
        // System.out.println(average);
      

        // 2.Q
        //int a = sc.nextInt();
        // int b = sc.nextInt();
       // System.out.println(a*a);
        

        // Q3.
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        // float totalCost =  ((pencil + pen + eraser));
        // totalCost = total + total * 0.18f;
        // totalCost = total * (1 + 0.18f);
        // totalCost = total * (1.18f);

        float totalCost =  ((pencil + pen + eraser) * 1.18f);
        System.out.println(totalCost);

        // Q4.
        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;
        double result = (f * b) + (i % c) - (d * s);
        System.out.println(result);

        System.out.println("add = " + (b + c + i));




    }
}
