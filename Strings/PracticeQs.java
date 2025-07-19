package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class PracticeQs {
    // Q1. Count how many times lowercase vowels occured in a String entered by the user.
    public static int countVowels(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }
    
    // Q2. What will be the output of the following code?


    // Q4. Determine if 2 strings are anagrams of each other.
    // ftwostringscontainthesamecharactersbutinadifferentorder,theycanbesaidtobeanagrams.Considerraceandcare.Inthiscase,race'scharacterscanbeformedintoastudy,orcare'scharacterscanbeformedintorace.Belowisajavaprogramtocheckiftwostringsare anagrams or not
   public static boolean isAnagram(String str1, String str2) {
        if (str1.length() != str2.length()) return false;

        char[] arr1 = str1.toCharArray();
        System.out.println(arr1);
        char[] arr2 = str2.toCharArray();
        System.out.println(arr2);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        String sortedstr1 = new String(arr1);
        System.out.println(sortedstr1); // Output: "abcd"
        
            String sortedstr2 = new String(arr2);
            System.out.println(sortedstr2);
        
            return sortedstr1.equals(sortedstr2);

        // return Arrays.equals(arr1, arr2);
          
        

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(countVowels(str));

        String str1 = "race";
        String str2 = "care";
        String str3 = "ShardhaDidi";
        System.out.println(str1.equals(str2) + " " + str1.equals(str3));
        // false true
       

        // replace methods works that replace letters to specificy the str3.
        String str4 = "ApnaCollege".replace("l", str3);
        System.out.println(str4);

        System.out.println(isAnagram(str1, str2));
        
    }
}
