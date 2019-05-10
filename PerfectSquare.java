import java.util.*;
public class PerfectSquare {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       boolean flag=false;
       for(int i=1;i<100;i++){
           if(a*b==i*i){
               flag=true;
               break;
           }
       }
       if(flag){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
       
    }
}
