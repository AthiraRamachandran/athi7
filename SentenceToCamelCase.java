import java.util.*;
public class SentenceToCamelCase {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String inputString =sc.nextLine();
        String result="";
       if (inputString.length() == 0) {
           System.out.println(result);
       }
       char firstChar = inputString.charAt(0);
       char firstCharToUpperCase = Character.toUpperCase(firstChar);
       result = result + firstCharToUpperCase;
       for (int i = 1; i < inputString.length(); i++) {
           char currentChar = inputString.charAt(i);
           char previousChar = inputString.charAt(i - 1);
           if (previousChar == ' ') {
               char currentCharToUpperCase = Character.toUpperCase(currentChar);
               result = result + currentCharToUpperCase;
           } else {
               char currentCharToLowerCase = Character.toLowerCase(currentChar);
               result = result + currentCharToLowerCase;
           }
       }
       System.out.println(result);

    }
}
