import java.util.*;
public Prime  {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int count=0;
       for(int i=a;i>=1;i--){
           if(a%i==0){
               count++;
               
           }
       }
       if(count==2){
           System.out.println("Yes");
       }else{
           System.out.println("No");
       }
    }
}
