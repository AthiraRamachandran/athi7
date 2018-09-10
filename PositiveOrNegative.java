public class PositiveOrNegative {
	public static void main(String args[]) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number you want to check");
		n = sc.nextInt();
		if (n < 0) {
			System.out.println("the entered number is negative");
		} else if (n > 0) {
			System.out.println("the entered number is positive");
		} else {
			System.out.println("the entered number is zero");
		}
	}
}
