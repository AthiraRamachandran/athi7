import java.util.*;
public class NumberOfWords {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
        String str1[]=str.split(" ");
        int len=str1.length;
        System.out.println(len);
    }
}
