import java.util.*;
 
public class ReverseNumber
{
   public static void main(String args[])
   {
       int reverse=0;
     Scanner sc=new Scanner(System.in);
     int a=sc.nextInt();
     while(a != 0){
         int num=a%10;
         reverse = reverse * 10 + num;
        num=num/10;

     }
     System.out.println(a);
   }
}
