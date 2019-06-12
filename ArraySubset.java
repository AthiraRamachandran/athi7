package prp;
import java.util.*;
public class ArraySubset {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		int count=0;
		for(int i=0;i<n1;i++){
			arr1[i]=sc.nextInt();
		}
		for(int i=0;i<n2;i++){
			arr2[i]=sc.nextInt();
		}
		for(int i=0;i<n1;i++){
			for(int j=0;j<n2;j++){
				if(arr1[i]==arr2[j]){
					count++;
				}
			}
		}
		if(count==n2){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
