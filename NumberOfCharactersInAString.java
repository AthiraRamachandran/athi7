import java.util.*;
public class NumberOfCharactersInAString {
    public static void main(String args[]) {
    Scanner sc=new Scanner(System.in);
    String string=sc.nextLine();
        int count = 1;    
        for(int i = 0; i < string.length(); i++) {    
                count++;    
        }    
            
        System.out.println(count);    

        
    }
}
