import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int min;
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
  min=arr[0];
  for(int i=0;i<n;i++){
      if(min>arr[i]){
          min=arr[i];
      }
  }
  System.out.println(min);
    }
}
