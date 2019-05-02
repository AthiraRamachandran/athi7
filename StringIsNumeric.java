import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        boolean bool=true;
        try{
            Double d=Double.parseDouble(s);
        }
        catch(NumberFormatException e){
            bool=false;
        }
        if(bool){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
} 
