package prp;
import java.util.*;
public class MaxNum {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int max=0;
		int num=sc.nextInt();
		int arr[]=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=sc.nextInt();
		}
		max=arr[0];
		for(int i=0;i<num;i++){
			if(max<arr[i]){
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
