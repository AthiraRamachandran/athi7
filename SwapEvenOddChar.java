import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        char temp;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        char c[]=s.toCharArray();
        for(int i=0;i<s.length();i=i+2){
            temp=c[i];
            c[i]=c[i+1];
            c[i+1]=temp;
        }
            System.out.println(c);
    }
}
