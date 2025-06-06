package Arrays;

import java.util.Scanner;

public class ArraysCC {


    public static void update(int score[]) {
        for (int i = 0; i < score.length; i++) {
            score[i] = score[i] + 1;
        }
    }
    public static void main(String[] args) {


        int marks[] = new int[50];
        
        // if the values are already known
        int numbers[] = { 1, 2, 4 };

        int moreNumbers[] = { 4, 3, 6 };

        String fruits[] = { "apple", "mango", "orange" };

        // Input  
        Scanner sc = new Scanner(System.in);
        // int phy;
        // phy = sc.nextInt();

        marks[0] = sc.nextInt();  //phy
        marks[1] = sc.nextInt();  //chem
        marks[2] = sc.nextInt(); // math

        // output
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);


        // update
        marks[2] = 100;
        System.out.println(marks[2]);

        System.out.println("length os array" + marks.length);
       
        int score[] = { 89, 98, 97 };
        // arrays is pass call by reference
        update(score);

        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + " ");
        }
        System.out.println();

    }
}
