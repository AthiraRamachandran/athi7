import java.util.*;
public class RangeBetweenNumber {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int n=sc.nextInt();
        boolean flag=false;
        for(int i=num1;i<=num2;i++){
            if(n==i){
                flag=true;
                break;
                }
        }
        if(flag){
            System.out.println("Yes");
    }
    else{
        System.out.println("No");
    }
    }
}
