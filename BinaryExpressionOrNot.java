import java.util.*;
public class BinaryExpressionOrNot {
    public static void main(String args[]) {
        int c=0;
        int r=0;
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int result=Integer.parseInt(s);
        while(result>0){
            if((result%10==0)||(result%10==1))
            c++;
            r++;
            result=result/10;
        }
        if(c==r){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
