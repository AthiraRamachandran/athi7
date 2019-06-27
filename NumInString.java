import java.util.*;
public class NumInString {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String res="";
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++){
			if(Character.isDigit(arr[i])){
				res+=arr[i];
			}
		}
		System.out.println(res);
	}	
}
