package Strings;

// For a given String convert each the first letter of each word to uppercase.

// "hi, i am shardha"
// Hi, I Am Shardha



public class lettersToUppercase {

    public static String toUpperCaseLetter(String str) {

    StringBuilder sb=new StringBuilder("");
  
    char ch=Character.toUpperCase(str.charAt(0));
    sb.append(ch);

    for(int i=1;i<str.length();i++){
        if (str.charAt(i) == ' ' && i < str.length() - 1) {
            sb.append(str.charAt(i));
            i++;
            ch = Character.toUpperCase(str.charAt(i));
            sb.append(ch);
        }
        else {
          sb.append(str.charAt(i));
        }
     
        }
    return sb.toString();
    }
    public static void main(String[] args) {
        String str = "hi, i am shardha";
       String result = toUpperCaseLetter(str);
       System.out.println(result);
    }
}
