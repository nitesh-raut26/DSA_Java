package Strings;

import java.util.Scanner;

public class stringJava {
    public static void printLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");

        }
        System.out.println();

    }
    
    // check if a String is a palindrome
    // "racecar",  "noon",  "madam"
   public static boolean isPalindrome(String str) {
       int n = str.length()-1;
       System.out.println(n);
       for (int i = 0; i < str.length() / 2; i++) {
           if (str.charAt(i) != str.charAt(n - i)) {
               return false;
           }
       }
       return true;
   }


    public static void main(String[] args) {
        char arr[] = { 'a', 'b', 'c', 'd' };
        String str = "abcd";
        String str2 = new String("racecar");

    // String are immutable

    Scanner sc = new Scanner(System.in);
    String name;
    // String name = sc.next();
     name = sc.next();
     System.out.println(name);
    
     //String fullName = "tony Stark";
     //System.out.println(fullName.length());

     //  concatention
     String firstName = "nitesh";
     String lastName = "raut";
     String fullName = firstName + " " + lastName;
     System.out.println(fullName);

    //  char index
     System.out.println(fullName.charAt(2));
     
     printLetters(str);
     boolean palindrome = isPalindrome(str2);
     System.out.println(palindrome);


    }
    
}
