import java.util.*;
public class Palindrome {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String str1=" ";
        for(int i=str.length()-1;i>=0;i--){
            str1+=str.charAt(i);
        }
                    if(str1==str){
                        System.out.println("Yes");
                    }else{
                        System.out.println("No");
                    }

    }
}
