public class numberOfDigits {
public static void main(String args[]) {
int Number, Count=0;
		sc = new Scanner(System.in);		
		System.out.println("enter the numbers:");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.format("\n Number of Digits:", Count);
    }
}
