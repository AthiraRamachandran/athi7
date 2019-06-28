import java.util.*;
public class LexicographicalOrder {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char arr[]=str.toCharArray();
		Arrays.sort(arr);
		String res=String.valueOf(arr);
		System.out.println(res);
	}

}
