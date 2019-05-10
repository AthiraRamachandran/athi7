import java.util.*;
public class OddElement {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int a;
       String str=" ";
       while(n!=0){
           a=n%10;
           
           if(a%2!=0){
               str+=a;
           }
           n=n/10;
       }
       for(int i=str.length()-1;i>=0;i--){
           System.out.print(str.charAt(i)+" ");
       }
       
    }
}
