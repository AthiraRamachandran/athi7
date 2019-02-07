import java.util.*;
public class PrimeNumbersBetweenIntervals{
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
        String primeNumbers="";
        int count;
        int a=sc.nextInt();
        int b=sc.nextInt();
        for(int i=a;i<=b;i++){
             for(int num =i; num>=1; num--){
            if(i%2==0){
                count++;
                break;
            }
            }
        
        if(count==2){
	     primeNumbers = primeNumbers + i + " ";

        }
        System.out.println(primeNumbers);
    }
}
