import java.util.*;
public ArmstrongNumber {
    public static void main(String args[]) {
               int a,c=0;
     Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int temp=n;
       while(n>0){
          a=n%10;
          a=n/10;
          c=c+(a*a*a);
       }
       if(temp==c){
           System.out.println("Yes");
       } else{
           System.out.println("No");
       }
    }
}
