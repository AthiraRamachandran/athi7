import java.util.*;
public class MiddleElementToStar {
    public static void main(String args[]) {
       Scanner sc=new Scanner(System.in);
       String str=sc.next();
       int mid;
           if(str.length()%2==0){
               mid=str.length()/2;
               String len=str.substring(mid-1,mid+2);
               len="**";
               System.out.println(str.substring(0,mid-1)+len+str.substring(mid+1));
           
       }else{
           mid=str.length()/2;
           String len=str.substring(mid);
           len="*";
           System.out.println(str.substring(0,mid)+len+str.substring(mid+1));
       }
    }
}
