package prp;
import java.util.*;
public class Fibonacci {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int n1=0,n2=1,sum=0;
		for(int i=1;i<=num;i++){
			System.out.println(n2);
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}

}
