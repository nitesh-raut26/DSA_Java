package Strings;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("");
        // it doesn't copy everytime like the String 
        for (char i = 'a'; i <= 'z'; i++) {
            sb.append(i);
        }
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
