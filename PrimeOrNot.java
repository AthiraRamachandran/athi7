public class Control12 {
	public static void main(String args[]) {
		int n, i, count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		n = sc.nextInt();
		for (i = 1; i <= n; i++) {
			if (n % 2 == 0) {
				count++;
				break;
			}
		}
		if (count == 0) {
			System.out.println("this is prime number");
		} else {
			System.out.println("this is not a prime number");
		}
	}
}
