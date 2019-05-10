import java.util.*;
public class SumCheck {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int c;
       int m1=Math.abs(a);
       int m2=Math.abs(b);
        c=m1+m2;
       if(c%2==0){
           System.out.println("Even");
       }else{
           System.out.println("Odd");
       }
    }
}
