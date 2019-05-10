import java.util.*;
public class Composite {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int count=0;
       for(int i=a;i>=1;i--){
           if(a%i==0){
               count++;
           }
       }
       if(count!=2){
           System.out.println("yes");
       }else{
           System.out.println("no");
       }
    }
}
