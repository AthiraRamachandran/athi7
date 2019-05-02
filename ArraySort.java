import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
} 
