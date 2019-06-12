package prp;
import java.util.*;
public class ArrayIndexSort {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int arr[]=new int[num];
		int count=0;
		for(int i=0;i<num;i++){
		arr[i]=sc.nextInt();	
		}
		for(int i=0;i<arr.length;i++){
			if(i==arr[i]){
				System.out.print(arr[i]+" ");
				count++;
			}
		}
		if(count==0){
			System.out.println(-1);
		}
		
	}

}
