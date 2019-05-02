import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int a[]=new int[num];
        int mid=a.length;
        int median;
                Arrays.sort(a);
        if(num%2==0){
            int sum=a[mid/2]+a[mid/2 - 1];
            median=sum/2;
        }else {
            median=mid/2;
        }
        System.out.println(median);
    }
} 
