public class Palindrome
{
    public static void main(String args[])
    {
        int n, m, a = 0,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("number:");
        n = sc.nextInt();
        m = n;
        while(n > 0)
        {
            x = n % 10;
            a = a * 10 + x;
            n = n / 10;
        }
        if(a == m)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
    }
