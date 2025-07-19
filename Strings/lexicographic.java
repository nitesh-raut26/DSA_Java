package Strings;


// lexicographic means that we compare the first letters of words 
// Question 3.
// For a given set of strings, print the largest string.
// aabcd   aabce  compare both words then wwe conclude that the aabcd is smaller than the aabce
// lexicographic
// apple mango and banana
// a is compare to the m and b and first come a then b then m.

// str1.compareTo(str2)
// 0 : equal
// < 0 : -ve str1<str2
// > 0 : +ve str1 > str2

// comparetoIgnoreCase it intrepts same as A and a



public class lexicographic {
    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" ,"pineapple"};
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}
