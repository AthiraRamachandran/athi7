public class PowerOfnumber {
public static void main(string args[]) {
Scanner sc=new Scanner(System.in);
System.out.println("enter the base:");
int base=sc.nextInt();
int temp=base;
System.out.println("enter the exponent:");
int exp=sc.nextInt();
for(int i=1;i<exp;i++)
{
temp=temp*temp;
}
Sysetm.out.println(" "+temp);
}
}
