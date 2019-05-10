import java.util.*;
public class VowelOrNot  {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
            String str1=" ";
    boolean flag=false;
for(int i=0;i<str.length();i++){
    str1+=str.charAt(i);
    if(str1.charAt(i)=='a' || str1.charAt(i)=='e' || str1.charAt(i)=='i' || str1.charAt(i)=='o' || str1.charAt(i)=='u'){
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
