package prp;
import java.util.*;
public class NumberSorted {
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int arr[]=new int[n];
	ArrayList al=new ArrayList();
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	for(int i=0;i<arr.length-1;i++)
	{
		for(int j=i+1;j<arr.length;j++)
		{
			if(arr[i]==arr[j])
			{
				al.add(arr[i]);
			}
		}
	}
	Collections.sort(al);
	if(al.size()==0) System.out.println("unique");
	else
	{
		for(int i=0;i<al.size();i++)
		{
			System.out.println(al.toString().replace("[","").replace("]","").replace(",",""));
			break;
		}
	}
  }
}
